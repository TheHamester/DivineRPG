package divinerpg.entities.eden;

import divinerpg.registries.*;
import divinerpg.util.LocalizeUtils;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.*;
import net.minecraft.world.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class EntityGemFin extends AbstractSchoolingFish {
    private byte variant;
    private boolean hasBeenFed;

    public EntityGemFin(EntityType<? extends EntityGemFin> type, Level level) {
        super(type, level);
        variant = (byte) getRandom().nextInt(3);
        hasBeenFed = false;
    }

    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("HasBeenFed", this.isFed());
        compound.putByte("Variant", variant);
    }

    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        if(compound.contains("HasBeenFed")) setFed(compound.getBoolean("HasBeenFed"));
        if(compound.contains("Variant")) variant = compound.getByte("Variant");
    }

    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack heldItem = player.getItemInHand(hand);
        if (!this.hasBeenFed && heldItem.getItem() == BlockRegistry.gemOfTheDunes.get().asItem()) {
            if (!player.isCreative()) {
                heldItem.shrink(1);
            }
            this.setFed(true);
            for (int i = 0; i < 7; ++i) {
                double d0 = this.random.nextGaussian() * 0.02D;
                double d1 = this.random.nextGaussian() * 0.02D;
                double d2 = this.random.nextGaussian() * 0.02D;
                this.level().addParticle(ParticleTypes.HEART, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), d0, d1, d2);
            }
            return InteractionResult.SUCCESS;
        } else if (heldItem.getItem() == Items.WATER_BUCKET && this.isAlive()) {
            Bucketable.bucketMobPickup(player, hand, this);
            return InteractionResult.SUCCESS;
        } else if (!this.hasBeenFed && !(heldItem.getItem() == BlockRegistry.gemOfTheDunes.get().asItem() || (heldItem.getItem() == Items.WATER_BUCKET))) {
            player.displayClientMessage(LocalizeUtils.clientMessage("feed_gem"), true);
            return InteractionResult.CONSUME;
        } else if (this.hasBeenFed && heldItem.getItem() == BlockRegistry.gemOfTheDunes.get().asItem()) {
            return InteractionResult.FAIL;
        } else
            return InteractionResult.PASS;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return !this.hasBeenFed;
    }

    public ItemStack getBucketItemStack() {
        return new ItemStack(ItemRegistry.gem_fin_bucket.get());
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.COD_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.COD_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.COD_HURT;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    public void setFed(boolean bool) {
        this.hasBeenFed = bool;
    }

    public boolean isFed() {
        return this.hasBeenFed;
    }

    public byte getVariant() {
        return variant;
    }
}
