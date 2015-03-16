package my.ostamatii.app;

import my.ostamatii.app.interfaces.Instructions;
import my.ostamatii.app.interfaces.Recipe;

public class BorshchRecipe implements Recipe{
	
	//String picture= "nothing";
	public Instructions instructions ;
	
	public BorshchRecipe(){}
	
	public BorshchRecipe(Instructions recipe){
		this.instructions = recipe;
	}

	public void show() {
		System.out.println("Borsch recipe: ");
		instructions.getInstructions();
		System.out.println("Bon Apetit! ");
	}
}
