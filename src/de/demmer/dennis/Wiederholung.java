package de.demmer.dennis;

public class Wiederholung {

public static void main(String[] args) {
		
		
		Item i1 = new Item("Tastatur z400");
		Item i2 = new Item(2.2, 5454545, "Logitech Maus", "Maus von logitech");
		Item i3 = new Item(55.5, 5646, "Bildschirm", "lorem ipsum beschreibung");
		
		
		i1.price = 5.5;
		i1.id = 235236532;
		i1.description = "Lorem ipsum";
		
		System.out.println(i1.price);
		
		
		System.out.println(i1.printInfo());
		System.out.println(i2.printInfo());
		System.out.println(i3.printInfo());
		
		
		Item[] items = {i1, i2, i3};
		
	}
	
	
}
