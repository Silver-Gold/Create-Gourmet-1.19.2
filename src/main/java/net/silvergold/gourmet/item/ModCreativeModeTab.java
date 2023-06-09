package net.silvergold.gourmet.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final CreativeModeTab GOURMET_TAB = new CreativeModeTab("gourmet_tab") {
        private final List<Supplier<? extends Item>> orderedItemList = Arrays.asList(
                // Items are listed in the order they should appear
                //Row 1
                () -> ModItems.VARIETY_DESSERT_PLATTER.get(),
                () -> ModItems.COMFORTING_DUMPLING_MEAL.get(),
                () -> ModItems.SOUTHERN_BREAKFAST.get(),
                () -> ModItems.BIG_BACON_BURGER_MEAL.get(),
                () -> ModItems.FRIED_EGG.get(),
                () -> ModItems.NEAPOLITAN_ICE_CREAM_CONE.get(),
                () -> ModItems.ICE_CREAM_CONE.get(),
                () -> ModItems.SWEET_BERRY_ICE_CREAM_CONE.get(),
                () -> ModItems.CHOCOLATE_ICE_CREAM_CONE.get(),
                //Row 2
                () -> ModItems.WAFFLE_STACK.get(),
                () -> ModItems.WAFFLE.get(),
                () -> ModItems.WAFFLE_BATTER.get(),
                () -> ModItems.FLATCAKE_STACK.get(),
                () -> ModItems.FLATCAKE.get(),
                () -> ModItems.FLATCAKE_BATTER.get(),
                () -> ModItems.ICE_CREAM_SCOOP.get(),
                () -> ModItems.SWEET_BERRY_ICE_CREAM_SCOOP.get(),
                () -> ModItems.CHOCOLATE_ICE_CREAM_SCOOP.get(),
                //Row 3
                () -> ModItems.CROISSANT.get(),
                () -> ModItems.CHEESE_DANISH.get(),
                () -> ModItems.SWEET_BERRY_DANISH.get(),
                () -> ModItems.GLOW_BERRY_DANISH.get(),
                () -> ModItems.CARROT_CAKE.get(),
                () -> ModItems.CARROT_CAKE_BASE.get(),
                () -> ModItems.FRIED_CHICKEN.get(),
                () -> ModItems.COOKED_DRUMSTICK.get(),
                () -> ModItems.RAW_DRUMSTICK.get(),
                //Row 4
                () -> ModItems.CROISSANT_DOUGH.get(),
                () -> ModItems.CHEESE_DANISH_DOUGH.get(),
                () -> ModItems.SWEET_BERRY_DANISH_DOUGH.get(),
                () -> ModItems.GLOW_BERRY_DANISH_DOUGH.get(),
                () -> ModItems.DUMPLING.get(),
                () -> ModItems.DUMPLING_WRAPPER.get(),
                () -> ModItems.CARAMELIZED_BACON.get(),
                () -> ModItems.COOKED_BACON.get(),
                () -> ModItems.RAW_BACON.get(),
                //Row 4
                () -> ModItems.BUTTER.get(),
                () -> ModItems.CHEESE.get(),
                () -> ModItems.CARROT_SLICES.get(),
                () -> ModItems.RAW_POTATO_FRY.get(),
                () -> ModItems.COOKED_FRIES.get(),
                () -> ModItems.BUNS.get(),
                () -> ModItems.BACON_BURGER.get(),
                () -> ModItems.BEEF_PATTY.get(),
                () -> ModItems.GROUND_BEEF.get(),
                //Row 5
                () -> ModItems.BATTER_BUCKET.get(),
                () -> ModItems.SEED_OIL_BOTTLE.get(),
                () -> ModItems.ICE_CUBE.get()

        );

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CROISSANT.get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            super.fillItemList(items);
            items.clear();
            for (Supplier<? extends Item> supplier : orderedItemList) {
                items.add(new ItemStack(supplier.get()));
            }
        }
    };
}
