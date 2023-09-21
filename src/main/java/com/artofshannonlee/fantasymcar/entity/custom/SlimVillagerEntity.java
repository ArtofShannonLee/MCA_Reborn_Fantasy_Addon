package com.artofshannonlee.fantasymcar.entity.custom;

import com.mojang.authlib.GameProfile;
import forge.net.mca.entity.VillagerEntityMCA;
import forge.net.mca.entity.VillagerLike;
import forge.net.mca.entity.ai.DialogueType;
import forge.net.mca.entity.ai.Genetics;
import forge.net.mca.entity.ai.Traits;
import forge.net.mca.entity.ai.brain.VillagerBrain;
import forge.net.mca.entity.ai.relationship.AgeState;
import forge.net.mca.entity.ai.relationship.Gender;
import forge.net.mca.entity.ai.relationship.VillagerDimensions;
import forge.net.mca.entity.interaction.EntityCommandHandler;
import forge.net.mca.server.world.data.PlayerSaveData;
import forge.net.mca.util.network.datasync.CDataManager;
import forge.net.mca.util.network.datasync.CParameter;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.entity.PartEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.logging.Level;


public class SlimVillagerEntity extends LivingEntity implements VillagerLike<VillagerEntityMCA>, IAnimatable {
    public Level world;
    public Gender gender;
    public SlimVillagerEntity(EntityType<?> pEntityType, net.minecraft.world.level.Level pLevel) {
        super ( (EntityType<? extends LivingEntity>) pEntityType, pLevel );
    }

    @Override
    public Genetics getGenetics() {
        return null;
    }

    @Override
    public Traits getTraits() {
        return null;
    }

    @Override
    public VillagerBrain<?> getVillagerBrain() {
        return null;
    }

    @Override
    public EntityCommandHandler<?> getInteractions() {
        return null;
    }

    @Override
    public void initialize(MobSpawnType spawnReason) {
        VillagerLike.super.initialize ( spawnReason );
    }

    @Override
    public boolean isSpeechImpaired() {
        return VillagerLike.super.isSpeechImpaired ();
    }

    @Override
    public boolean isToYoungToSpeak() {
        return VillagerLike.super.isToYoungToSpeak ();
    }

    @Override
    public void playSpeechEffect() {
        VillagerLike.super.playSpeechEffect ();
    }

    @Override
    public void setName(String name) {
        VillagerLike.super.setName ( name );
    }

    @Override
    public void setCustomSkin(String name) {
        VillagerLike.super.setCustomSkin ( name );
    }

    @Override
    public void updateCustomSkin() {
        VillagerLike.super.updateCustomSkin ();
    }

    @Override
    public GameProfile getGameProfile() {
        return VillagerLike.super.getGameProfile ();
    }

    @Override
    public boolean hasCustomSkin() {
        return VillagerLike.super.hasCustomSkin ();
    }

    @Override
    public boolean canBeAttractedTo(VillagerLike<?> other) {
        return VillagerLike.super.canBeAttractedTo ( other );
    }

    @Override
    public boolean canBeAttractedTo(PlayerSaveData other) {
        return VillagerLike.super.canBeAttractedTo ( other );
    }

    @Override
    public InteractionHand getDominantHand() {
        return VillagerLike.super.getDominantHand ();
    }

    @Override
    public InteractionHand getOpposingHand() {
        return VillagerLike.super.getOpposingHand ();
    }

    @Override
    public EquipmentSlot getSlotForHand(InteractionHand hand) {
        return VillagerLike.super.getSlotForHand ( hand );
    }

    @Override
    public EquipmentSlot getDominantSlot() {
        return VillagerLike.super.getDominantSlot ();
    }

    @Override
    public EquipmentSlot getOpposingSlot() {
        return VillagerLike.super.getOpposingSlot ();
    }

    @Override
    public ResourceLocation getProfessionId() {
        return VillagerLike.super.getProfessionId ();
    }

    @Override
    public String getProfessionName() {
        return VillagerLike.super.getProfessionName ();
    }

    @Override
    public MutableComponent getProfessionText() {
        return VillagerLike.super.getProfessionText ();
    }

    @Override
    public boolean isProfessionImportant() {
        return VillagerLike.super.isProfessionImportant ();
    }

    @Override
    public boolean requiresHome() {
        return VillagerLike.super.requiresHome ();
    }

    @Override
    public boolean canTradeWithProfession() {
        return VillagerLike.super.canTradeWithProfession ();
    }

    @Override
    public String getClothes() {
        return VillagerLike.super.getClothes ();
    }

    @Override
    public void setClothes(ResourceLocation clothes) {
        VillagerLike.super.setClothes ( clothes );
    }

    @Override
    public void setClothes(String clothes) {
        VillagerLike.super.setClothes ( clothes );
    }

    @Override
    public String getHair() {
        return VillagerLike.super.getHair ();
    }

    @Override
    public void setHair(String hair) {
        VillagerLike.super.setHair ( hair );
    }

    @Override
    public void setHairDye(DyeColor color) {
        VillagerLike.super.setHairDye ( color );
    }

    @Override
    public void clearHairDye() {
        VillagerLike.super.clearHairDye ();
    }

    @Override
    public float[] getHairDye() {
        return VillagerLike.super.getHairDye ();
    }

    @Override
    public AgeState getAgeState() {
        return VillagerLike.super.getAgeState ();
    }

    @Override
    public VillagerDimensions getVillagerDimensions() {
        return VillagerLike.super.getVillagerDimensions ();
    }

    @Override
    public void updateSpeed() {
        VillagerLike.super.updateSpeed ();
    }

    @Override
    public boolean setAgeState(AgeState state) {
        return VillagerLike.super.setAgeState ( state );
    }

    @Override
    public float getHorizontalScaleFactor() {
        return VillagerLike.super.getHorizontalScaleFactor ();
    }

    @Override
    public float getRawScaleFactor() {
        return VillagerLike.super.getRawScaleFactor ();
    }

    @Override
    public DialogueType getDialogueType(Player receiver) {
        return VillagerLike.super.getDialogueType ( receiver );
    }

    @Override
    public TranslatableComponent getTranslatable(Player target, String phraseId, Object... params) {
        return VillagerLike.super.getTranslatable ( target, phraseId, params );
    }

    @Override
    public void sendChatToAllAround(MutableComponent phrase) {
        VillagerLike.super.sendChatToAllAround ( phrase );
    }

    @Override
    public void sendChatToAllAround(String phrase, Object... params) {
        VillagerLike.super.sendChatToAllAround ( phrase, params );
    }

    @Override
    public void sendChatMessage(Player target, String phraseId, Object... params) {
        VillagerLike.super.sendChatMessage ( target, phraseId, params );
    }

    @Override
    public MutableComponent transformMessage(MutableComponent message) {
        return VillagerLike.super.transformMessage ( message );
    }

    @Override
    public MutableComponent sendChatMessage(MutableComponent message, Entity receiver) {
        return VillagerLike.super.sendChatMessage ( message, receiver );
    }

    @Override
    public void sendEventMessage(Component message, Player receiver) {
        VillagerLike.super.sendEventMessage ( message, receiver );
    }

    @Override
    public void sendEventMessage(Component message) {
        VillagerLike.super.sendEventMessage ( message );
    }

    @Override
    public void initializeSkin(boolean isPlayer) {
        VillagerLike.super.initializeSkin ( isPlayer );
    }

    @Override
    public void randomizeClothes() {
        VillagerLike.super.randomizeClothes ();
    }

    @Override
    public void randomizeHair() {
        VillagerLike.super.randomizeHair ();
    }

    @Override
    public void validateClothes() {
        VillagerLike.super.validateClothes ();
    }

    @Override
    public CompoundTag toNbtForConversion(EntityType<?> convertingTo) {
        return VillagerLike.super.toNbtForConversion ( convertingTo );
    }

    @Override
    public void readNbtForConversion(EntityType<?> convertingFrom, CompoundTag input) {
        VillagerLike.super.readNbtForConversion ( convertingFrom, input );
    }

    @Override
    public void copyVillagerAttributesFrom(VillagerLike<?> other) {
        VillagerLike.super.copyVillagerAttributesFrom ( other );
    }
    public static AttributeSupplier setAttributes() {
        return null;
    }
    @Override
    public boolean isHostile() {
        return VillagerLike.super.isHostile ();
    }

    @Override
    public PlayerModel getPlayerModel() {
        return VillagerLike.super.getPlayerModel ();
    }

    @Override
    public boolean isBurned() {
        return false;
    }

    @Override
    public void spawnBurntParticles() {
        VillagerLike.super.spawnBurntParticles ();
    }

    @Override
    public boolean isInfected() {
        return VillagerLike.super.isInfected ();
    }

    @Override
    public void setInfected(boolean infected) {
        VillagerLike.super.setInfected ( infected );
    }

    @Override
    public float getInfectionProgress() {
        return 0;
    }

    @Override
    public void setInfectionProgress(float v) {

    }

    @Override
    public CDataManager<VillagerEntityMCA> getTypeDataManager() {
        return null;
    }

    @Override
    public <P, TrackedP> void setTrackedValue(CParameter<P, TrackedP> key, P value) {
        VillagerLike.super.setTrackedValue ( key, value );
    }

    @Override
    public <P, TrackedP> P getTrackedValue(CParameter<P, TrackedP> key) {
        return VillagerLike.super.getTrackedValue ( key );
    }

    @Override
    public @NotNull VillagerData getVillagerData() {
        return null;
    }

    @Override
    public void setVillagerData(@NotNull VillagerData pData) {

    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {

    }

    @Override
    public Iterable<ItemStack> getArmorSlots() {
        return null;
    }

    @Override
    public ItemStack getItemBySlot(EquipmentSlot pSlot) {
        return null;
    }

    @Override
    public void setItemSlot(EquipmentSlot pSlot, ItemStack pStack) {

    }

    @Override
    public HumanoidArm getMainArm() {
        return null;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {

    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return null;
    }

    @Override
    public Mob asEntity() {
        return VillagerLike.super.asEntity ();
    }

    @Override
    public boolean alwaysAccepts() {
        return super.alwaysAccepts ();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        super.deserializeNBT ( nbt );
    }

    @Override
    public CompoundTag serializeNBT() {
        return super.serializeNBT ();
    }

    @Override
    public boolean shouldRiderSit() {
        return super.shouldRiderSit ();
    }

    @Override
    public ItemStack getPickedResult(HitResult target) {
        return super.getPickedResult ( target );
    }

    @Override
    public boolean canRiderInteract() {
        return super.canRiderInteract ();
    }

    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return super.canBeRiddenInWater ( rider );
    }

    @Override
    public MobCategory getClassification(boolean forSpawnCount) {
        return super.getClassification ( forSpawnCount );
    }

    @Override
    public boolean isMultipartEntity() {
        return super.isMultipartEntity ();
    }

    @Nullable
    @Override
    public PartEntity<?>[] getParts() {
        return super.getParts ();
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) {
        return super.getCapability ( cap );
    }

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }
}

