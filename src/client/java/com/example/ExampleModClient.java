package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.text.Text;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {
			if (!itemStack.isOf(ModItems.SUSPICIOUS_SUBSTANCE)) {
				return;
			}
			list.add(Text.translatable("itemTooltip.example.suspicious_substance"));
		});
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}