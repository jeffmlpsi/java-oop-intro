package oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalTest {
    @Test void TestAnimalandDog() {
        Animal a = new Animal();
        a.setId(1);
        assertEquals(1, a.getId());
        assertNotNull(a.sound(), "By default it is mute");

        Dog d = new Dog();
        d.setId(2);
        assertEquals(2, d.getId());
        assertNotNull("Dog '2' is barking", d.sound() );
    }
}
