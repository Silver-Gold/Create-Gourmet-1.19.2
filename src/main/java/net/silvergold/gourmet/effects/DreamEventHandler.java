package net.silvergold.gourmet.effects;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.silvergold.gourmet.item.specialitem.DreamyFoodItems;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;

@Mod.EventBusSubscriber(modid = "gourmet")
public class DreamEventHandler {
    //static float alpha = 0.0f;
    //private int alphaTimer = 0;
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {

        Player player = event.player;
        CompoundTag persistentData = player.getPersistentData(); // Get the persistent data for this player

        if (!persistentData.contains("alpha")) { // Check if this player has the custom variable stored
            persistentData.putFloat("alpha", 0.0f); // If not, set it to a default value (in this case, 0)
        }
        if (!persistentData.contains("alphaTimer")) { // Check if this player has the custom variable stored
            persistentData.putInt("alphaTimer", 0); // If not, set it to a default value (in this case, 0)
        }

        float alpha = persistentData.getFloat("alpha"); // Get the current value of the custom variable
        int alphaTimer = persistentData.getInt("alphaTimer"); // Get the current value of the custom variable

        if ((event.phase == TickEvent.Phase.START) && (event.player.level.isClientSide)) {
            if (event.player.isUsingItem()) {
                ItemStack itemStack = event.player.getUseItem();
                if (itemStack.getItem() instanceof DreamyFoodItems) {
                    alphaTimer += 1;
                    if (alphaTimer > 22) {
                        if (alpha < 0.07f) {
                            alpha += 0.0015f;
                        }
                    }
                    System.out.println(alpha);
                }
            } else {
                if (alpha > 0.0f) {
                    alpha -= 0.003f;
                } else {
                    alpha = 0.0f;
                }
                alphaTimer = 0;
            }
        }

        persistentData.putFloat("alpha", alpha);
        persistentData.putInt("alphaTimer", alphaTimer);
    }

    @SubscribeEvent
    public static void renderOverlay(RenderGuiOverlayEvent.Post event) {
        Player player = Minecraft.getInstance().player;
        float alpha = 0.0f;
        if (player != null) {
            CompoundTag persistentData = player.getPersistentData(); // Get the persistent data for this player

            alpha = persistentData.getFloat("alpha");
        }

        //float alpha = 0.1f;
        var gui = Minecraft.getInstance().gui;

        float screenWidth = Minecraft.getInstance().getWindow().getGuiScaledWidth();
        float screenHeight = Minecraft.getInstance().getWindow().getGuiScaledHeight();

        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        //
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, alpha);
        RenderSystem.setShaderTexture(0, TextureAtlas.LOCATION_BLOCKS);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        TextureAtlasSprite textureatlassprite = Minecraft.getInstance().getBlockRenderer().getBlockModelShaper().getParticleIcon(Blocks.NETHER_PORTAL.defaultBlockState());
        float u0 = textureatlassprite.getU0();
        float v0 = textureatlassprite.getV0();
        float u1 = textureatlassprite.getU1();
        float v1 = textureatlassprite.getV1();
        Tesselator tesselator = Tesselator.getInstance();
        BufferBuilder bufferbuilder = tesselator.getBuilder();
        bufferbuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
        bufferbuilder.vertex(0.0D, (double) screenHeight, -90.0D).uv(u0, v1).endVertex();
        bufferbuilder.vertex((double) screenWidth, (double) screenHeight, -90.0D).uv(u1, v1).endVertex();
        bufferbuilder.vertex((double) screenWidth, 0.0D, -90.0D).uv(u1, v0).endVertex();
        bufferbuilder.vertex(0.0D, 0.0D, -90.0D).uv(u0, v0).endVertex();
        tesselator.end();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    }
}
