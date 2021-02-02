package com.skynet.sometools.client.input;

import com.skynet.sometools.common.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

/**
 * TODO KeyBoardInput
 *
 * @program: SomeTools-Forge-1.16.3-34.1.0-mdk
 * @author: 1260535819@qq.com
 * @create: 2021-01-28 07:13
 */

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class KeyBoardInput {
    public static final KeyBinding MESSAGE_KEY = new KeyBinding("key.message",
            KeyConflictContext.IN_GAME,
            KeyModifier.CONTROL,
            InputMappings.Type.KEYSYM,
            GLFW.GLFW_KEY_J,
            "key.category." + Utils.MOD_ID);

    @SubscribeEvent
    public static void onKeyboardInput(InputEvent.KeyInputEvent event) {
        if (MESSAGE_KEY.isPressed()) {
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.sendMessage(new TranslationTextComponent("message." + Utils.MOD_ID +
                    ".press"), Minecraft.getInstance().player.getUniqueID());
        }
    }
}

