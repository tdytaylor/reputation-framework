package com.taylor.reputation;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class TestClassLoader {

    public static void main(String[] args) {
        /**System.out.println(System.getProperty("java.ext.dirs"));
         System.out.println();
         System.out.println(System.getProperty("java.class.path"));
         System.out.println("*************");
         URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
         for (URL url : urls) {
         System.out.println(url.toExternalForm());
         }*/
        Thread.currentThread().setContextClassLoader(TestClassLoader.class.getClassLoader().getParent());
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("driver:" + driver.getClass() + ",loader:" + driver.getClass().getClassLoader());
            System.out.println("current thread contextloader:" + Thread.currentThread().getContextClassLoader());
            System.out.println("ServiceLoader loader:" + ServiceLoader.class.getClassLoader());
        }
    }
}
