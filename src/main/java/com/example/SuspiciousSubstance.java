package com.example;

import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

public class SuspiciousSubstance extends Item {

	public SuspiciousSubstance(Settings settings) {
		super(settings);
		
	}
	@Override
	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
		tooltip.add(Text.translatable("itemTooltip.example.suspicious_substance"));
	}

}
//a testjgajoidjgoijiojweajiojlif