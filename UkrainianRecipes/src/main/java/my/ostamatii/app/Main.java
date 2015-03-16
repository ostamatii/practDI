package my.ostamatii.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("RecipeProjectBean.xml");
		RecipesBook rb = (RecipesBook) context.getBean("recipesBook");
		if (rb!=null)rb.read();
		else System.out.println("null");

	}

}
