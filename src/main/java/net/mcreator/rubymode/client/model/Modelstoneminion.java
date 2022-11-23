package net.mcreator.rubymode.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelstoneminion<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("rubymode", "modelstoneminion"), "main");
	public final ModelPart head;
	public final ModelPart stoneCircle;
	public final ModelPart stoneCircle2;

	public Modelstoneminion(ModelPart root) {
		this.head = root.getChild("head");
		this.stoneCircle = root.getChild("stoneCircle");
		this.stoneCircle2 = root.getChild("stoneCircle2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -2.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stoneCircle = partdefinition.addOrReplaceChild("stoneCircle",
				CubeListBuilder.create().texOffs(30, 20).addBox(-12.0F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(10.0F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
						.addBox(-1.0F, -2.0F, -12.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 26)
						.addBox(-1.0F, -2.0F, 10.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 3.0F, 0.0F));
		PartDefinition stoneCircle2 = partdefinition.addOrReplaceChild("stoneCircle2",
				CubeListBuilder.create().texOffs(0, 26).addBox(-12.2929F, -2.0F, -1.7071F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(21, 23).addBox(9.7071F, -2.0F, -1.7071F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 20)
						.addBox(-1.2929F, -2.0F, -12.7071F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-1.2929F, -2.0F, 9.2929F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.0F, 0.0F, -1.5708F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		stoneCircle.render(poseStack, buffer, packedLight, packedOverlay);
		stoneCircle2.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.stoneCircle2.zRot = ageInTicks / 20.f;
		this.stoneCircle.xRot = ageInTicks / 20.f;
	}
}
