package com.xpgaming.xPPokeDex;
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;
import com.pixelmonmod.pixelmon.config.PixelmonItemsPokeballs;
import com.pixelmonmod.pixelmon.items.PixelmonItem;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import ninja.leaping.configurate.objectmapping.ObjectMappingException;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.mutable.item.EnchantmentData;
import org.spongepowered.api.data.meta.ItemEnchantment;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.item.Enchantment;
import org.spongepowered.api.item.Enchantments;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.ItemTypes;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.item.inventory.ItemStackGenerator;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

public class Config {
    private static Config instance = new Config();

    public static Config getInstance() {
        return instance;
    }

    private ConfigurationLoader<CommentedConfigurationNode> configLoader;
    private CommentedConfigurationNode config;
    private File configFile;

    public ItemType Type(String item) {
        ItemType i = Sponge.getGame().getRegistry().getType(ItemType.class,item).get();
        return i;
    }

    /*public ItemStack ShinyToken() {
        ItemStack token = ItemStack.builder()
                .itemType(ItemTypes.PAPER)
                .quantity(1)
                .build();
        token.offer(Keys.DISPLAY_NAME, Text.of(TextColors.GOLD, "Shiny Token"));
        List<Text> lore = Lists.newArrayList(Text.of(TextColors.YELLOW, "Right-click to transform your\ncurrently selected Pokemon\ninto a shiny!"));
        token.offer(Keys.ITEM_LORE, lore);
        return token;
    }*/

    public void configCreate() throws ObjectMappingException {
        try {
            configFile.createNewFile();
            configLoad();
            CommentedConfigurationNode rewards = config.getNode("rewards").setComment("xP// PokeDex coded by Xenoyia! Check out mc.xpgaming.com!");
            CommentedConfigurationNode pd = config.getNode("playerData").setComment("Do not mess with this unless you know what you are doing!");
            ItemStack reward10 = ItemStack.builder()
                    .itemType(Type("pixelmon:tm114"))
                    .quantity(1)
                    .build();
            ItemStack reward10b = ItemStack.builder()
                    .itemType(Type("pixelmon:poke_ball"))
                    .quantity(16)
                    .build();
            ItemStack reward20 = ItemStack.builder()
                    .itemType(Type("pixelmon:tm28"))
                    .quantity(1)
                    .build();
            ItemStack reward20b = ItemStack.builder()
                    .itemType(Type("pixelmon:great_ball"))
                    .quantity(8)
                    .build();
            ItemStack reward30 = ItemStack.builder()
                    .itemType(Type("pixelmon:park_ball"))
                    .quantity(1)
                    .build();
            ItemStack reward30b = ItemStack.builder()
                    .itemType(Type("pixelmon:tm59"))
                    .quantity(1)
                    .build();
            ItemStack reward40 = ItemStack.builder()
                    .itemType(Type("pixelmon:tm38"))
                    .quantity(1)
                    .build();
            ItemStack reward40b = ItemStack.builder()
                    .itemType(Type("pixelmon:ultra_ball"))
                    .quantity(16)
                    .build();
            ItemStack reward50 = ItemStack.builder()
                    .itemType(Type("pixelmon:tm122"))
                    .quantity(1)
                    .build();
            ItemStack reward50b = ItemStack.builder()
                    .itemType(Type("pixelmon:repeat_ball"))
                    .quantity(8)
                    .build();
            ItemStack reward60 = ItemStack.builder()
                    .itemType(Type("pixelmon:tm24"))
                    .quantity(1)
                    .build();
            ItemStack reward60b = ItemStack.builder()
                    .itemType(Type("pixelmon:quick_ball"))
                    .quantity(8)
                    .build();
            ItemStack reward70 = ItemStack.builder()
                    .itemType(Type("pixelmon:park_ball"))
                    .quantity(1)
                    .build();
            ItemStack reward70b = ItemStack.builder()
                    .itemType(Type("pixelmon:quick_ball"))
                    .quantity(16)
                    .build();
            ItemStack reward80 = ItemStack.builder()
                    .itemType(Type("pixelmon:park_ball"))
                    .quantity(2)
                    .build();
            ItemStack reward90 = ItemStack.builder()
                    .itemType(Type("pixelmon:park_ball"))
                    .quantity(2)
                    .build();
            ItemStack rewardfinal = ItemStack.builder()
                    .itemType(Type("pixelmon:dynamo_badge"))
                    .quantity(1)
                    .build();
            rewards.getNode("reward10", "numberOfRewards").setValue(2);
            rewards.getNode("reward10", "moneyReward").setValue("100");
            rewards.getNode("reward10", 1).setValue(TypeToken.of(ItemStack.class), reward10);
            rewards.getNode("reward10", 2).setValue(TypeToken.of(ItemStack.class), reward10b);
            rewards.getNode("reward20", "moneyReward").setValue("150");
            rewards.getNode("reward20", "numberOfRewards").setValue(2);
            rewards.getNode("reward20", 1).setValue(TypeToken.of(ItemStack.class), reward20);
            rewards.getNode("reward20", 2).setValue(TypeToken.of(ItemStack.class), reward20b);
            rewards.getNode("reward30", "moneyReward").setValue("200");
            rewards.getNode("reward30", "numberOfRewards").setValue(2);
            rewards.getNode("reward30", 1).setValue(TypeToken.of(ItemStack.class), reward30);
            rewards.getNode("reward30", 2).setValue(TypeToken.of(ItemStack.class), reward30b);
            rewards.getNode("reward40", "moneyReward").setValue("250");
            rewards.getNode("reward40", "numberOfRewards").setValue(2);
            rewards.getNode("reward40", 1).setValue(TypeToken.of(ItemStack.class), reward40);
            rewards.getNode("reward40", 2).setValue(TypeToken.of(ItemStack.class), reward40b);
            rewards.getNode("reward50", "moneyReward").setValue("300");
            rewards.getNode("reward50", "numberOfRewards").setValue(2);
            rewards.getNode("reward50", 1).setValue(TypeToken.of(ItemStack.class), reward50);
            rewards.getNode("reward50", 2).setValue(TypeToken.of(ItemStack.class), reward50b);
            rewards.getNode("reward60", "moneyReward").setValue("500");
            rewards.getNode("reward60", "numberOfRewards").setValue(2);
            rewards.getNode("reward60", 1).setValue(TypeToken.of(ItemStack.class), reward60);
            rewards.getNode("reward60", 2).setValue(TypeToken.of(ItemStack.class), reward60b);
            rewards.getNode("reward70", "moneyReward").setValue("800");
            rewards.getNode("reward70", "numberOfRewards").setValue(2);
            rewards.getNode("reward70", 1).setValue(TypeToken.of(ItemStack.class), reward70);
            rewards.getNode("reward70", 2).setValue(TypeToken.of(ItemStack.class), reward70b);
            rewards.getNode("reward80", "moneyReward").setValue("1600");
            rewards.getNode("reward80", "numberOfRewards").setValue(1);
            rewards.getNode("reward80", 1).setValue(TypeToken.of(ItemStack.class), reward80);
            rewards.getNode("reward90", "moneyReward").setValue("3500");
            rewards.getNode("reward90", "numberOfRewards").setValue(1);
            rewards.getNode("reward90", 1).setValue(TypeToken.of(ItemStack.class), reward90);
            rewards.getNode("rewardfinal", "moneyReward").setValue("8000");
            rewards.getNode("rewardfinal", "numberOfRewards").setValue(1);
            rewards.getNode("rewardfinal", 1).setValue(TypeToken.of(ItemStack.class), rewardfinal);
            configSave();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setup(File configFile, ConfigurationLoader<CommentedConfigurationNode> configLoader) {
        this.configLoader = configLoader;
        this.configFile = configFile;
        if (!configFile.exists()) {
            try {
                configCreate();
            } catch (ObjectMappingException e) {
                e.printStackTrace();
            }
        } else
            configLoad();
    }

    public CommentedConfigurationNode getConfig() {
        return config;
    }

    public void configLoad() {
        if (!configFile.exists()) {
            try {
                configCreate();
            } catch (ObjectMappingException e) {
                e.printStackTrace();
            }
        } else
            try {
                config = configLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void configSave() {
        try {
            configLoader.save(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAndLoadConfig() {
        configSave();
        configLoad();
    }
}