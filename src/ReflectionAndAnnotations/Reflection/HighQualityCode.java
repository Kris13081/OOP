package ReflectionAndAnnotations.Reflection;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.TreeSet;

import static ReflectionAndAnnotations.Reflection.ReflectionUtils.*;

public class HighQualityCode {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();

        Field[] declaredFields = clazz.getDeclaredFields();

        TreeSet<Field> fields = collectByName(Arrays.stream(declaredFields));

        filterMembers(fields.stream(), f -> !Modifier.isPrivate(f.getModifiers()))
                .forEach(f -> System.out.println(f.getName() + " must be private!"));

        TreeSet<Method> getters = collectByName(filterMembersByName(declaredMethods, "get"));

        filterMembers(getters.stream(), g -> !Modifier.isPublic(g.getModifiers()))
                .forEach(g -> System.out.println(g.getName() + " have to be public!"));

        TreeSet<Method> setters = collectByName(filterMembersByName(declaredMethods, "set"));

        filterMembers(setters.stream(), s -> !Modifier.isPrivate(s.getModifiers()))
                .forEach(s -> System.out.println(s.getName() + " have to be private!"));

    }
}
