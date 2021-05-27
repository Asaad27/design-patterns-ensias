package adapter.otherFilters;

import adapter.Image;

//third party library filter
public class Caramel {
	public void init(){
		System.out.println("initializing caramel filter");
	}

	public void render(Image image){
		System.out.println("Applying caramel filter");
	}
}
