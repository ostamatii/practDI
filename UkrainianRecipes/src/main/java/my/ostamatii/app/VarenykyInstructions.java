package my.ostamatii.app;

import my.ostamatii.app.interfaces.Instructions;

public class VarenykyInstructions implements Instructions{

	private String text ="On Sale Change Settings\n"+
		"DOUGH:\n"+
		" 5 cups all-purpose flour\n"+
		" 1 teaspoon salt\n"+
		" 2 tablespoons butter, softened\n"+
		" 1 cup evaporated milk\n"+
		" 1/2 cup water\n"+
		 
		"FILLING:\n"+
		" 6 medium potatoes, cut into small cubes\n"+
		" 2 large onions, finely chopped\n"+
		" 1/2 cup butter\n"+
		" 1 cup shredded Cheddar cheese\n"+
		" salt and pepper to taste\n"+
		 
		"ALTERNATE FILLING:\n"+
		" 1 pound sauerkraut\n"+
		" 2 large onions, finely chopped\n"+
		" 1/2 cup butter\n"+
		" 3 cups finely shredded green cabbage\n"+
		" 1 cube chicken bouillon\n"+
		" 2 teaspoons pepper";
	
	public void getInstructions() {
		System.out.println(text);			
	}

}
