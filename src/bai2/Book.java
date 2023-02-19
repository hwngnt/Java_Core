package bai2;

import bai2.category;

public class Book extends Document{
	private String author;
	private int pages;
	
	public Book(String nxb, int number, String author, int pages) {
		super(nxb, number);
		this.author = author;
		this.pages = pages;
		this.category = category.Book;
	}
	
	public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
//    	return "Book\n" + "id:\t" + id + "\nnxb:\t" + nxb +
//				"\nnumber:\t" + number + "\nauthor:\t" + author + 
//				"\npages:\t" + pages;
    	
    	return "Book\n" + "id:\t" + id;
    }
	
}
