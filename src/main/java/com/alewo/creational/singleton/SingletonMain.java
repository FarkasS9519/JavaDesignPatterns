package com.alewo.creational.singleton;

/**
 * @author Sándor Farkas
 * 2019.03.19
 */

public class SingletonMain {

    /**
     * From:
     *   - https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
     *   - https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
     *
     * Singleton pattern restricts the instantiation of a class
     * and ensures that only one instance of the class exists in the java virtual machine.
     *
     * Singleton pattern is used for logging, drivers objects, caching and thread pool.
     *
     * Common concepts:
     *     - Private constructor to restrict instantiation of the class from other classes.
     *     - Private static variable of the same class that is the only instance of the class.
     *     - Public static method that returns the instance of the class, this is the global
     *       access point for outer world to get the instance of the singleton class.
     *
     */


    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
