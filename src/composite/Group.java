package composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
	private final List<Component> components = new ArrayList<>();

	public void add(Component shape){
		components.add(shape);
	}

	@Override
	public void render(){
		for (var component : components)
		{
			component.render();
			/*if (object instanceof Shape)
				((Shape)object).render();
			else
				((Group)object).render();*/
		}

	}

	@Override
	public void resize() {
		for (var component : components)
			component.resize();
	}
}
