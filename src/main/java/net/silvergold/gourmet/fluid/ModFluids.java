package net.silvergold.gourmet.fluid;

import net.silvergold.gourmet.Gourmet;
import net.silvergold.gourmet.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Gourmet.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_SEED_OIL = FLUIDS.register("seed_oil",
            () -> new ForgeFlowingFluid.Source(ModFluids.SEED_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SEED_OIL = FLUIDS.register("flowing_seed_oil",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SEED_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_BATTER = FLUIDS.register("batter",
            () -> new ForgeFlowingFluid.Source(ModFluids.BATTER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BATTER = FLUIDS.register("flowing_batter",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BATTER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties SEED_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SEED_OIL_FLUID_TYPE, SOURCE_SEED_OIL, FLOWING_SEED_OIL); //ADD .bucket(ModItems.SEED_OIL_BUCKET)
    public static final ForgeFlowingFluid.Properties BATTER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.BATTER_FLUID_TYPE, SOURCE_BATTER, FLOWING_BATTER); //ADD .bucket(ModItems.SEED_OIL_BUCKET)



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}