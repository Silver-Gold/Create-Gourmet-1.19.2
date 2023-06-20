package net.silvergold.gourmet;

import com.mojang.logging.LogUtils;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.silvergold.gourmet.fluid.ModFluidTypes;
import net.silvergold.gourmet.fluid.ModFluids;
import net.silvergold.gourmet.item.ModItems;
import net.silvergold.gourmet.item.specialitem.DreamyFoodItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Gourmet.MOD_ID)
public class Gourmet
{
    public static final String MOD_ID = "gourmet";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Gourmet()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    //Dreamy Food Code
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        // Check if the event is in the correct phase
        if (event.phase == TickEvent.Phase.END) {
            // The event.player field contains the player for this event
            Player player = event.player;

            // Check if the player is currently eating your food item
            if (!player.isUsingItem()) return;

            ItemStack activeItem = player.getUseItem();
            if (activeItem.getItem() instanceof DreamyFoodItems) {
                // Activate the portal overlay effect
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 65, 1, true, false));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
