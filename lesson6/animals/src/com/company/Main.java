package com.company;

public class Main {

    public static void main(String[] args) {
	    Lion lion = new Lion();
	    Bird bird = new Bird();
	    Security security = new Security();

	    security.feed(bird);
	    security.feed(lion);

    }
}
