package proxy;

public class RealEbook implements Ebook {
	private String file_name;

	public RealEbook(String file_name) {
		this.file_name = file_name;
		load();
	}

	private void load(){
		System.out.println("Loading the ebook " + file_name);
	}

	@Override
	public void show(){
		System.out.println("showing the ebook " + file_name);
	}

	@Override
	public String getFile_name() {
		return file_name;
	}
}
