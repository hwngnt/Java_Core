package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookManagement {
	List<Document> documents;
	
	public BookManagement() {
		this.documents = new ArrayList<>();
	}
	
	public void addDocument(Document document) {
		this.documents.add(document);
	}
	
	public void deleteDocument(String id) {		
		for (Document doc : this.documents) {
			if (doc.getId().contains(id)) {
				this.documents.remove(doc);
				System.out.println("Remove document with id " + id + " successfully!");
			}
			else System.out.print("Document not found\n");
		}
	}
	
	public void showDocument() {
		this.documents.stream().forEach(doc -> System.out.println(doc.toString()));
	}
	
	public List<Document> searchDocumentByCategory(String category) {
		return this.documents.stream().filter(doc -> doc.getCategory().contains(category)).collect(Collectors.toList());
		
//		return this.canbos.stream().filter(cb -> cb.getName().contains(name)).collect(Collectors.toList());
	}
}
