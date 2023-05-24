package net.silvergold.gourmet.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GOURMET_TAB = new CreativeModeTab("gourmet_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COOKED_BACON.get());
        }
    };
}
