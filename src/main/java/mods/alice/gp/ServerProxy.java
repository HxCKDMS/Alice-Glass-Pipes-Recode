 package mods.alice.gp;
 
 import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.List;
 
@SuppressWarnings("unchecked")
public class ServerProxy {
    public void forgePreInitialization(FMLPreInitializationEvent event) {
       CraftingManager craft = CraftingManager.getInstance();

       List<IRecipe> recipeList = craft.getRecipeList();

       recipeList.add(new ShapedOreRecipe(new ItemStack(GlassPipe.INSTANCE.pipeItemGlass, 24), "GDG", 'G', "blockGlass", 'D', "gemDiamond"));
    }

    public void forgeInitialization(FMLInitializationEvent event) {}
    }
