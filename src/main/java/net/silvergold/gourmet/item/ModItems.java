package net.silvergold.gourmet.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silvergold.gourmet.Gourmet;
import net.silvergold.gourmet.fluid.ModFluids;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Gourmet.MOD_ID);

    //Row 1
    public static final RegistryObject<Item> VARIETY_DESSERT_PLATTER = ITEMS.register("variety_dessert_platter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.SOUTHERN_BREAKFAST)));
    public static final RegistryObject<Item> COMFORTING_DUMPLING_MEAL = ITEMS.register("comforting_dumpling_meal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.BRAISED_CHICKEN_AND_DUMPLINGS)));
    public static final RegistryObject<Item> SOUTHERN_BREAKFAST = ITEMS.register("southern_breakfast",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.SOUTHERN_BREAKFAST)));
    public static final RegistryObject<Item> ICE_CREAM_CONE = ITEMS.register("ice_cream_cone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.ICE_CREAM_CONE)));
    public static final RegistryObject<Item> SWEET_BERRY_ICE_CREAM_CONE = ITEMS.register("sweet_berry_ice_cream_cone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.FLAVORED_ICE_CREAM_CONE)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM_CONE = ITEMS.register("chocolate_ice_cream_cone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.FLAVORED_ICE_CREAM_CONE)));
    public static final RegistryObject<Item> NEAPOLITAN_ICE_CREAM_CONE = ITEMS.register("neapolitan_ice_cream_cone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.NEAPOLITAN_ICE_CREAM_CONE)));
    public static final RegistryObject<Item> CARROT_CAKE = ITEMS.register("carrot_cake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.CHEESE_DANISH)));
    public static final RegistryObject<Item> CARROT_CAKE_BASE = ITEMS.register("carrot_cake_base",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.CROISSANT)));
    //Row 2
    public static final RegistryObject<Item> WAFFLE_STACK = ITEMS.register("waffle_stack",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.WAFFLE_STACK)));
    public static final RegistryObject<Item> WAFFLE = ITEMS.register("waffle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.WAFFLE)));
    public static final RegistryObject<Item> WAFFLE_BATTER = ITEMS.register("waffle_batter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> ICE_CREAM_SCOOP = ITEMS.register("ice_cream_scoop",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.ICE_CREAM_SCOOP)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM_SCOOP = ITEMS.register("chocolate_ice_cream_scoop",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.ICE_CREAM_SCOOP)));
    public static final RegistryObject<Item> SWEET_BERRY_ICE_CREAM_SCOOP = ITEMS.register("sweet_berry_ice_cream_scoop",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.ICE_CREAM_SCOOP)));
    public static final RegistryObject<Item> FLATCAKE_STACK = ITEMS.register("flatcake_stack",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.FLATCAKE_STACK)));
    public static final RegistryObject<Item> FLATCAKE = ITEMS.register("flatcake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.FLATCAKE)));
    public static final RegistryObject<Item> FLATCAKE_BATTER = ITEMS.register("flatcake_batter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    //Row 3
    public static final RegistryObject<Item> CROISSANT = ITEMS.register("croissant",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.CROISSANT)));
    public static final RegistryObject<Item> CHEESE_DANISH = ITEMS.register("cheese_danish",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.CHEESE_DANISH)));
    public static final RegistryObject<Item> SWEET_BERRY_DANISH = ITEMS.register("sweet_berry_danish",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.SWEET_BERRY_DANISH)));
    public static final RegistryObject<Item> GLOW_BERRY_DANISH = ITEMS.register("glow_berry_danish",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.GLOW_BERRY_DANISH)));
    public static final RegistryObject<Item> DUMPLING = ITEMS.register("dumpling",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.DUMPLING)));
    public static final RegistryObject<Item> DUMPLING_WRAPPER = ITEMS.register("dumpling_wrapper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> FRIED_CHICKEN = ITEMS.register("fried_chicken",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.FRIED_CHICKEN)));
    public static final RegistryObject<Item> COOKED_DRUMSTICK = ITEMS.register("cooked_drumstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.COOKED_DRUMSTICK)));
    public static final RegistryObject<Item> RAW_DRUMSTICK = ITEMS.register("raw_drumstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.RAW_DRUMSTICK)));
    //Row 4
    public static final RegistryObject<Item> CROISSANT_DOUGH = ITEMS.register("croissant_dough",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> CHEESE_DANISH_DOUGH = ITEMS.register("cheese_danish_dough",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> SWEET_BERRY_DANISH_DOUGH = ITEMS.register("sweet_berry_danish_dough",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> GLOW_BERRY_DANISH_DOUGH = ITEMS.register("glow_berry_danish_dough",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> BATTER_BUCKET = ITEMS.register("batter_bucket",
            () -> new BucketItem(ModFluids.SOURCE_BATTER,
                    new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> SEED_OIL_BOTTLE = ITEMS.register("seed_oil_bottle",
            () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> CARAMELIZED_BACON = ITEMS.register("caramelized_bacon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.CARAMELIZED_BACON)));
    public static final RegistryObject<Item> COOKED_BACON = ITEMS.register("cooked_bacon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.COOKED_BACON)));
    public static final RegistryObject<Item> RAW_BACON = ITEMS.register("raw_bacon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.RAW_BACON)));
    //Row 5
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.CHEESE)));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.BUTTER)));
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.FRIED_EGG)));
    //Sequenced Assembly
    public static final RegistryObject<Item> INCOMPLETE_CROISSANT_DOUGH = ITEMS.register("incomplete_croissant_dough",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> INCOMPLETE_FLATCAKE_STACK = ITEMS.register("incomplete_flatcake_stack",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> INCOMPLETE_WAFFLE_STACK = ITEMS.register("incomplete_waffle_stack",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> INCOMPLETE_DUMPLING = ITEMS.register("incomplete_dumpling",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));
    public static final RegistryObject<Item> INCOMPLETE_CARROT_CAKE = ITEMS.register("incomplete_carrot_cake",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB)));

    public static class Foods {
        public static final FoodProperties SOUTHERN_BREAKFAST = new FoodProperties.Builder().nutrition(9).saturationMod(0.8f).build();
        public static final FoodProperties BRAISED_CHICKEN_AND_DUMPLINGS = new FoodProperties.Builder().nutrition(9).saturationMod(0.8f).build();
        public static final FoodProperties DUMPLING = new FoodProperties.Builder().nutrition(6).saturationMod(0.5f).meat().build();
        public static final FoodProperties RAW_BACON = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).meat().fast().build();
        public static final FoodProperties GROUND_BEEF = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).meat().build();
        public static final FoodProperties COOKED_BACON = new FoodProperties.Builder().nutrition(3).saturationMod(0.5f).fast().build();
        public static final FoodProperties CARAMELIZED_BACON = new FoodProperties.Builder().nutrition(6).saturationMod(0.5f).meat().fast().build();
        public static final FoodProperties RAW_DRUMSTICK = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).meat().fast().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
        public static final FoodProperties COOKED_DRUMSTICK = new FoodProperties.Builder().nutrition(3).saturationMod(0.5f).fast().build();
        public static final FoodProperties FRIED_CHICKEN = new FoodProperties.Builder().nutrition(6).saturationMod(0.5f).meat().fast().build();
        public static final FoodProperties BUTTER = new FoodProperties.Builder().nutrition(1).saturationMod(0.25f).fast().build();
        public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1).saturationMod(0.25f).fast().build();
        public static final FoodProperties CROISSANT = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build();
        public static final FoodProperties SWEET_BERRY_DANISH = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).build();
        public static final FoodProperties GLOW_BERRY_DANISH = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).build();
        public static final FoodProperties CHEESE_DANISH = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
        public static final FoodProperties FLATCAKE = new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build();
        public static final FoodProperties FLATCAKE_STACK = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).build();
        public static final FoodProperties FLATCAKE_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).fast().build();
        public static final FoodProperties WAFFLE = new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build();
        public static final FoodProperties WAFFLE_STACK = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).build();
        public static final FoodProperties FRENCH_TOAST = new FoodProperties.Builder().nutrition(3).saturationMod(0.5f).fast().build();
        public static final FoodProperties FRIED_EGG = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).fast().build();
        public static final FoodProperties ICE_CREAM_CONE = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build();
        public static final FoodProperties FLAVORED_ICE_CREAM_CONE = new FoodProperties.Builder().nutrition(6).saturationMod(0.7f).build();
        public static final FoodProperties NEAPOLITAN_ICE_CREAM_CONE = new FoodProperties.Builder().nutrition(7).saturationMod(0.6f).build();
        public static final FoodProperties ICE_CREAM_SCOOP = new FoodProperties.Builder().nutrition(3).saturationMod(0.5f).build();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
