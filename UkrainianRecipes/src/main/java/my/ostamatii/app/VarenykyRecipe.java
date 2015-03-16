package my.ostamatii.app;

import my.ostamatii.app.interfaces.Instructions;
import my.ostamatii.app.interfaces.Recipe;

public class VarenykyRecipe implements Recipe{
	
	public Instructions instructions ;
	
	public VarenykyRecipe(){}
	
	public VarenykyRecipe(Instructions recipe){
		this.instructions = recipe;
	}

	public void show() {
		System.out.println("Varenyky recipe: ");
		instructions.getInstructions();
		System.out.println("Bon Apetit! ");
	}
}
