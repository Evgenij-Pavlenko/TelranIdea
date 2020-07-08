package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass("1", "2");
        Class<? extends SomeClass> aClass = someClass.getClass();
        Class classVar1 = null;
        try {
            classVar1 = Class.forName("com.company.SomeClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(classVar1.getSimpleName());
        System.out.println(classVar1.getName());
        System.out.println(classVar1.getSuperclass());
        Class[] interfaces = classVar1.getInterfaces();
        System.out.println("-----------implements interfaces-------");
        for (Class cl : interfaces) {
            System.out.println(cl.getSimpleName());
        }
        Field[] fields = classVar1.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getType().getSimpleName() + " " + f.getName());
            try {
                f.setAccessible(true);
                f.set(someClass, "hello");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(someClass);
        System.out.println("-------constructors-------");
        Constructor[] declaredConstructors = classVar1.getDeclaredConstructors();
        for (Constructor con : declaredConstructors) {
            System.out.println(con);
        }

        SomeClass newIns = null;
        try {
            Constructor<SomeClass> constructor = classVar1.getConstructor(String.class, String.class);
            newIns = constructor.newInstance("3", "4");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(newIns);
    }

}

