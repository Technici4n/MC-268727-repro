package dev.technici4n.configrace.mixin;

import net.minecraft.network.protocol.Packet;
import net.minecraft.server.network.config.JoinWorldTask;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(JoinWorldTask.class)
public class JoinWorldTaskMixin {
    @Inject(at = @At("RETURN"), method = "start")
    public void onStart(Consumer<Packet<?>> consumer, CallbackInfo ci) throws InterruptedException {
        Thread.sleep(15000);
    }
}
