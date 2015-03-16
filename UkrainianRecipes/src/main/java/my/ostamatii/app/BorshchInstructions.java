package my.ostamatii.app;

import my.ostamatii.app.interfaces.Instructions;

public class BorshchInstructions implements Instructions{

	private String text ="1 (16 ounce) package pork sausage\n"+
						 "3 medium beets, peeled and shredded\n"+
						 "3 carrots, peeled and shredded\n"+
						 "3 medium baking potatoes, peeled and cubed\n"+
						 "1 tablespoon vegetable oil\n"+
						 "1 medium onion, chopped\n"+
						 "1 (6 ounce) can tomato paste\n"+
						 "3/4 cup water\n"+
						 "1/2 medium head cabbage, cored and shredded\n"+
						 "1 (8 ounce) can diced tomatoes, drained\n"+
						 "3 cloves garlic, minced\n"+
						 "salt and pepper to taste\n"+
						 "1 teaspoon white sugar, or to taste\n"+
						 "1/2 cup sour cream, for topping\n"+
						 "1 tablespoon chopped fresh parsley for garnish";
	
	public void getInstructions() {
		System.out.println(text);		
	}
	
}
