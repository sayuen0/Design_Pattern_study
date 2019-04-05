package iterator.bookshelf;

public class Main {
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf(10);
		bookshelf.appendBook(new Book("ガリバー旅行記"));
		bookshelf.appendBook(new Book("アンドロイドは電気羊の夢を見るか？"));
		bookshelf.appendBook(new Book("ドグラ・マグラ"));
		bookshelf.appendBook(new Book("こころ"));
		bookshelf.appendBook(new Book("舞姫"));
		Iterator it = bookshelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}

}
