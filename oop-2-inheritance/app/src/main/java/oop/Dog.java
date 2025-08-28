package oop;

class Dog extends Animal {
	
	// Own behavior
	private String bark() {
		return "Dog '" + getId() + "' is barking";
	}

	
	public String sound() {
		return bark();
	}
}