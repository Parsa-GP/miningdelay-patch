package com.r39ny.mpbreakparity.mpminingparity.mixin;

import net.minecraft.client.MultiplayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiplayerInteractionManager.class)
public abstract class PlayerControllerMPMixin {

    @Shadow
    private int breakingDelayTicks;

    @Inject(method = "cancelBlockBreaking", at = @At("TAIL"))
    private void resetBreakingDelay(CallbackInfo ci) {
        this.breakingDelayTicks = 0;
    }
}
