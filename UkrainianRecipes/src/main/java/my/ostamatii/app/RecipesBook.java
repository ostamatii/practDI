package my.ostamatii.app;

import java.util.Map;
import my.ostamatii.app.interfaces.Book;
import my.ostamatii.app.interfaces.Recipe;

public class RecipesBook implements Book {

	private Map<String, Recipe> recipesAll;
	
	public void read() {
		System.out.println("UKRAINIAN RECIPES");
		System.out.println("");
		for (String key: recipesAll.keySet()){
			Recipe recipe = recipesAll.get(key);
			recipe.show();
			System.out.println("");
		}
		System.out.println("END");
	}

	public void setRecipesAll(Map<String, Recipe> rec) {
		this.recipesAll = rec;
		}
	
}
