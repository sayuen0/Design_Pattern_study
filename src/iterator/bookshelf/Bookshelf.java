package iterator.bookshelf;

public class Bookshelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	public Bookshelf(int maxsize) {
		this.books = new Book[maxsize];
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Book getBookAt (int index) {
		return books[index];
	}
	public void appendBook(Book b) {
		this.books[last] = b;
		last++;
	}
	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		return new BookshelfIterator(this);
	}

}
