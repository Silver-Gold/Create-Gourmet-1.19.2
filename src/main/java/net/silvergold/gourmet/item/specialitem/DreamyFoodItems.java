package net.silvergold.gourmet.item.specialitem;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.silvergold.gourmet.item.ModCreativeModeTab;

import java.util.Optional;

public class DreamyFoodItems extends Item {
    public DreamyFoodItems() {
        super(new Item.Properties().tab(ModCreativeModeTab.GOURMET_TAB).food(new FoodProperties.Builder().alwaysEat().build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.EAT; // Ensures the eating animation is played
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 60; // Change this to the number of ticks you want eating to take
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entityLiving) {
        if (!world.isClientSide && entityLiving instanceof ServerPlayer) {
            ServerPlayer serverPlayerEntity = (ServerPlayer) entityLiving;
            ServerLevel serverWorld = (ServerLevel) world;

            Optional<Vec3> respawnPosition = Player.findRespawnPositionAndUseSpawnBlock(
                    serverWorld,
                    serverPlayerEntity.getRespawnPosition(),
                    serverPlayerEntity.getYRot(),
                    serverPlayerEntity.isRespawnForced(),
                    true);

            if (respawnPosition.isPresent()) {
                ServerLevel respawnWorld = serverWorld.getServer().getLevel(serverPlayerEntity.getRespawnDimension());

                if (respawnWorld != null) {
                    serverPlayerEntity.teleportTo(
                            respawnWorld,
                            respawnPosition.get().x,
                            respawnPosition.get().y,
                            respawnPosition.get().z,
                            serverPlayerEntity.getYRot(),
                            serverPlayerEntity.getXRot());
                } else {
                    //serverPlayerEntity.sendMessage(new TranslatableComponent("message.modid.respawn_dimension_not_found"), Util.NIL_UUID);
                }
            } else {
                //serverPlayerEntity.sendMessage(new TranslatableComponent("message.modid.no_spawn_point_set"), Util.NIL_UUID);
            }
        }

        if (entityLiving instanceof Player) {
            Player playerEntity = (Player) entityLiving;

            // Add a cooldown
            int cooldownDuration = 20; // 30 seconds (20 ticks per second)
            playerEntity.getCooldowns().addCooldown(this, cooldownDuration);
        }

        return super.finishUsingItem(stack, world, entityLiving);
    }
}
