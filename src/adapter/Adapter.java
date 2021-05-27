package adapter;

import adapter.otherFilters.Caramel;

public class Adapter {
	public static void main(String[] args) {
		var imageView = new ImageView(new Image());
		imageView.apply(new WandBFilter());
		imageView.apply(new CaramelFilter(new Caramel())); //Adapter
	}
}
