package singleton.crash;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class Singleton2Test {

    @Test
    void equals() {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        assertEquals(singleton1, singleton2);
    }

    @Test
    void crash() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singleton2> constructors = Singleton2.class.getDeclaredConstructor();
        constructors.setAccessible(true);
        Singleton2 singleton1 = constructors.newInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        assertNotEquals(singleton1, singleton2);
    }

}