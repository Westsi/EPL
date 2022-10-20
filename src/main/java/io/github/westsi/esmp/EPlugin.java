package io.github.westsi.esmp;

import io.github.westsi.esmp.listeners.SmithingTableListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class EPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SmithingTableListener(), this);
        //crafting
        //boots
        ItemStack nb = new ItemStack(Material.NETHERITE_BOOTS);
        ShapedRecipe nbr = new ShapedRecipe(nb);
        nbr.shape("* *", "* *");
        nbr.setIngredient('*', Material.NETHERITE_INGOT);
        //leggings
        ItemStack nl = new ItemStack(Material.NETHERITE_LEGGINGS);
        ShapedRecipe nlr = new ShapedRecipe(nl);
        nlr.shape("***", "* *", "* *");
        nlr.setIngredient('*', Material.NETHERITE_INGOT);
        //chestplate
        ItemStack nc = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ShapedRecipe ncr = new ShapedRecipe(nc);
        ncr.shape("* *", "***", "***");
        ncr.setIngredient('*', Material.NETHERITE_INGOT);
        //helmet
        ItemStack nh = new ItemStack(Material.NETHERITE_HELMET);
        ShapedRecipe nhr = new ShapedRecipe(nh);
        nhr.shape("***", "* *");
        nhr.setIngredient('*', Material.NETHERITE_INGOT);

        //axe
        ItemStack na = new ItemStack(Material.NETHERITE_AXE);
        ShapedRecipe nar = new ShapedRecipe(na);
        nar.shape("** ", "*$ ", " $ ");
        nar.setIngredient('*', Material.NETHERITE_INGOT);
        nar.setIngredient('$', Material.STICK);
        //sword
        ItemStack ns = new ItemStack(Material.NETHERITE_SWORD);
        ShapedRecipe nsr = new ShapedRecipe(ns);
        nsr.shape(" * ", " * ", " $ ");
        nsr.setIngredient('*', Material.NETHERITE_INGOT);
        nsr.setIngredient('$', Material.STICK);
        //pickaxe
        ItemStack np = new ItemStack(Material.NETHERITE_PICKAXE);
        ShapedRecipe npr = new ShapedRecipe(np);
        npr.shape("***", " $ ", " $ ");
        npr.setIngredient('*', Material.NETHERITE_INGOT);
        npr.setIngredient('$', Material.STICK);
        //hoe
        ItemStack nho = new ItemStack(Material.NETHERITE_HOE);
        ShapedRecipe nhor = new ShapedRecipe(nho);
        nhor.shape("** ", " $ ", " $ ");
        nhor.setIngredient('*', Material.NETHERITE_INGOT);
        nhor.setIngredient('$', Material.STICK);
        //shovel
        ItemStack nsh = new ItemStack(Material.NETHERITE_SHOVEL);
        ShapedRecipe nshr = new ShapedRecipe(nsh);
        nshr.shape(" * ", " $ ", " $ ");
        nshr.setIngredient('*', Material.NETHERITE_INGOT);
        nshr.setIngredient('$', Material.STICK);

        //custom tnt recipe
        ItemStack tnt = new ItemStack(Material.TNT);
        ShapedRecipe tntr = new ShapedRecipe(tnt);
        tntr.shape("*%*", "%*%", "*%*");
        tntr.setIngredient('*', Material.GUNPOWDER);
        tntr.setIngredient('%', Material.PAPER);

        getServer().addRecipe(nbr);
        getServer().addRecipe(nlr);
        getServer().addRecipe(ncr);
        getServer().addRecipe(nhr);

        getServer().addRecipe(tntr);

        getServer().addRecipe(nar);
        getServer().addRecipe(nhor);
        getServer().addRecipe(npr);
        getServer().addRecipe(nsr);
        getServer().addRecipe(nshr);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
