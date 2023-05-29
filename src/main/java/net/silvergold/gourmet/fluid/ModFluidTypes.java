package net.silvergold.gourmet.fluid;

import com.mojang.math.Vector3f;
import net.silvergold.gourmet.Gourmet;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    //Seed Oil
    public static final ResourceLocation SEED_OIL_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation SEED_OIL_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation SEED_OIL_RL = new ResourceLocation(Gourmet.MOD_ID, "misc/seed_oil_overlay");
    //Batter
    public static final ResourceLocation Batter_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation Batter_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation Batter_RL = new ResourceLocation(Gourmet.MOD_ID, "misc/seed_oil_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Gourmet.MOD_ID);

    //Seed Oil
    public static final RegistryObject<FluidType> SEED_OIL_FLUID_TYPE = register("seed_oil",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));
    //Batter
    public static final RegistryObject<FluidType> BATTER_FLUID_TYPE = register("batter",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(SEED_OIL_STILL_RL, SEED_OIL_FLOWING_RL, SEED_OIL_RL,
                0xA1DCB506, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}