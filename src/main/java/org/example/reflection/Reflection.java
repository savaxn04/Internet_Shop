package org.example.reflection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.ReflectionException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    private static final Logger LOGGER = LogManager.getLogger(Reflection.class);

    public static void showReflection() throws ReflectionException {
        try {
            Class<?> reflectionClass = Class.forName("org.example.entity.person.userTypes.Customer");
            Constructor<?>[] constructor = reflectionClass.getConstructors();
            Field[] fields = reflectionClass.getDeclaredFields();
            Method[] methods = reflectionClass.getMethods();
            Arrays.stream(fields).toList().forEach(LOGGER::info);
            System.out.println();
            Arrays.stream(constructor).toList().forEach(LOGGER::info);
            System.out.println();
            Arrays.stream(methods).toList().forEach(LOGGER::info);
            Class<?> Superclass = reflectionClass.getSuperclass();
            System.out.println();
            LOGGER.info(Superclass.getName());
            Object reflectionObject = reflectionClass.getConstructor().newInstance();
            LOGGER.info(reflectionObject);
        } catch (Exception e) {
            LOGGER.error(e);
            throw new ReflectionException();
        }
    }
}
