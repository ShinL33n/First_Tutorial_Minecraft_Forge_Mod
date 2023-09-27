package net.shinleen.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shinleen.tutorialmod.TutorialMod;
import net.shinleen.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIALMOD_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("tutorialmod_items_tab",
                    ()-> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.RUBY.get()))
                            .title(Component.translatable("creativetab.tutorialmod_items_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.RUBY.get());
                                pOutput.accept(ModItems.RAW_RUBY.get());
                                pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                                pOutput.accept(ModBlocks.RUBY_ORE.get());
                            })
                            .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
