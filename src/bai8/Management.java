package bai8;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
import java.util.List;

public class Management {
	List<Card> cards;
	
	public Management() {
        this.cards = new ArrayList<>();
    }
	
	public void add(Card card) {
        this.cards.add(card);
    }
	
	public void delete(String id) {
		Card c = this.cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
		if (c == null) {
			System.out.println("No teacher found");
		}
		else {
    		this.cards.remove(c);
    		System.out.println("Remove card successfully");
    	}
	}
	
	public void show(String id) {
		Card c = this.cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
		if (c == null) {
			System.out.println("No teacher found");
		}
		else {
    		System.out.println(c.toString());
    	}
	}
}
