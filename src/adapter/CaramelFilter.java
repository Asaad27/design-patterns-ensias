package adapter;

import adapter.otherFilters.Caramel;

//this is the adapter
public class CaramelFilter implements Filter{
	private Caramel caramel;

	public CaramelFilter(Caramel caramel) {
		this.caramel = caramel;
	}

	@Override
	public void apply(Image image) {
		caramel.init();
		caramel.render(image);
	}
}
