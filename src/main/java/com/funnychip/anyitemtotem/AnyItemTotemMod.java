package com.funnychip.anyitemtotem;

import net.fabricmc.api.ModInitializer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AnyItemTotemMod implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("AnyItemTotem mod loaded!");
        // Actual death prevention would be handled in a Mixin or event listener
    }
}
