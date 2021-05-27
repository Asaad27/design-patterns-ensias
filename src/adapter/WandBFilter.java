package adapter;

public class WandBFilter implements Filter{
	@Override
	public void apply(Image image) {
		System.out.println("applying w&&b filter");
	}
}
