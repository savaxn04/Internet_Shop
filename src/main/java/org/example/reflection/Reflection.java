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
            Class<?> c = Class.forName("org.example.entity.person.userTypes.Customer");
            Constructor<?>[] constructor = c.getConstructors();
            Field[] fields = c.getDeclaredFields();
            Method[] methods = c.getMethods();
            Arrays.stream(fields).toList().forEach(LOGGER::info);
            System.out.println();
            Arrays.stream(constructor).toList().forEach(LOGGER::info);
            System.out.println();
            Arrays.stream(methods).toList().forEach(LOGGER::info);
            Class<?> cSuperclass = c.getSuperclass();
            System.out.println();
            LOGGER.info(cSuperclass.getName());
            Object v = c.getConstructor().newInstance();
            LOGGER.info(v);
        } catch (Exception e) {
            LOGGER.error(e);
            throw new ReflectionException();
        }
    }
}
