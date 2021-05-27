package proxy;

public class LoginEbookProxy implements Ebook{
	private String fileName;
	private RealEbook ebook;

	public LoginEbookProxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void show() {
		if (ebook == null)
			ebook = new RealEbook(fileName);

		System.out.println("ebook login " + fileName);
		ebook.show();
	}

	@Override
	public String getFile_name() {
		return fileName;
	}
}
