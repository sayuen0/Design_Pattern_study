package iterator.bookshelf;

public class BookshelfIterator implements Iterator{
	private Bookshelf bookshelf;
	private int index;
	public BookshelfIterator(Bookshelf shelf) {
		this.bookshelf = shelf;
		this.index = 0;
	}

	public boolean hasNext() {
		if(index<bookshelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}
	public Object next() {
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}

}
