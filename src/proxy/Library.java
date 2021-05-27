package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
	private Map<String, Ebook> ebooks = new HashMap<>();

	public void add(Ebook ebook){
		ebooks.put(ebook.getFile_name(), ebook);
	}

	public void openEbook(String fileName){
		ebooks.get(fileName).show();
	}
}
