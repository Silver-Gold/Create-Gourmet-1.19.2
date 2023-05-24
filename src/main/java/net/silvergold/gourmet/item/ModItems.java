package net.silvergold.gourmet.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silvergold.gourmet.Gourmet;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Gourmet.MOD_ID);

    //Bacon
    public static final RegistryObject<Item> RAW_BACON = ITEMS.register("raw_bacon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.RAW_BACON)));
    public static final RegistryObject<Item> COOKED_BACON = ITEMS.register("cooked_bacon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.COOKED_BACON)));
    public static final RegistryObject<Item> CARAMELIZED_BACON = ITEMS.register("caramelized_bacon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.CARAMELIZED_BACON)));
    //Drumstick
    public static final RegistryObject<Item> RAW_DRUMSTICK = ITEMS.register("raw_drumstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.RAW_DRUMSTICK)));
    public static final RegistryObject<Item> COOKED_DRUMSTICK = ITEMS.register("cooked_drumstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.COOKED_DRUMSTICK)));
    public static final RegistryObject<Item> FRIED_CHICKEN = ITEMS.register("fried_chicken",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.FRIED_CHICKEN)));
    //Ingredients
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(Foods.BUTTER)));

    public static class Foods {
        public static final FoodProperties RAW_BACON = new FoodProperties.Builder().nutrition(2).saturationMod(0.6f).meat().fast().build();
        public static final FoodProperties COOKED_BACON = new FoodProperties.Builder().nutrition(6).saturationMod(1.6f).meat().fast().build();
        public static final FoodProperties CARAMELIZED_BACON = new FoodProperties.Builder().nutrition(8).saturationMod(1.6f).meat().fast().build();
        public static final FoodProperties RAW_DRUMSTICK = new FoodProperties.Builder().nutrition(2).saturationMod(0.6f).meat().fast().build();
        public static final FoodProperties COOKED_DRUMSTICK = new FoodProperties.Builder().nutrition(6).saturationMod(1.6f).meat().fast().build();
        public static final FoodProperties FRIED_CHICKEN = new FoodProperties.Builder().nutrition(8).saturationMod(1.6f).meat().fast().build();
        public static final FoodProperties BUTTER = new FoodProperties.Builder().nutrition(1).saturationMod(0.6f).fast().build();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
