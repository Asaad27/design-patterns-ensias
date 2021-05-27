package composite;

public class Shape implements Component {

	private String shape_name;

	public Shape(String shape_name) {
		this.shape_name = shape_name;
	}

	@Override
	public void render(){
		System.out.println("render shape " + shape_name);
	}

	@Override
	public void resize() {
		System.out.println("resizing " + shape_name );
	}

	public String getShape_name() {
		return shape_name;
	}

}
