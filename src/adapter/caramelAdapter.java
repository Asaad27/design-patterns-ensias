package adapter;

import adapter.otherFilters.Caramel;

//Adapter using inheritance
public class caramelAdapter extends Caramel implements Filter {
	@Override
	public void apply(Image image) {
		init();
		render(image);
	}
}
