package singleton.crash;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.util.concurrent.Executors.newFixedThreadPool;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SingletonTest {

    @Test
    void equals() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertEquals(singleton1, singleton2);
    }

    @Test
    void crash() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Singleton singleton1 = Singleton.getInstance();

        Constructor<Singleton> constructors = Singleton.class.getDeclaredConstructor();
        constructors.setAccessible(true);
        Singleton singleton2 = constructors.newInstance();

        assertNotEquals(singleton1, singleton2);
    }

}