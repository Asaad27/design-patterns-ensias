package proxy;

//Lazy initialization
//open close principle
public class ProxyMain {
	public static void main(String[] args) {
		var library = new Library();
		String[] fileNames = {"a", "b", "c"};
		for (var name : fileNames) {
			library.add(new EbookProxy(name));
			library.add(new LoginEbookProxy(name));
		}

		library.openEbook("c");
	}
}
