package ReflectionАndAnnotationsEX.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class<RichSoilLand> clazz = RichSoilLand.class;

        Field[] declaredFields = clazz.getDeclaredFields();

        String command = scanner.nextLine();
        Function<Field, String> fieldStringFunction = (f -> String.format("%s %s %s", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName()));


        while (!"HARVEST".equals(command)) {

            switch (command) {
                case "private":
                case "protected":
                case "public":
                    printer(declaredFields, command);
                    break;
                case "all":
                    Arrays.stream(declaredFields).map(fieldStringFunction).forEach(System.out::println);
                    break;
            }

            command = scanner.nextLine();
        }

    }

    private static void printer(Field[] fields, String command) {

        Function<Field, String> fieldStringFunction = (f -> String.format("%s %s %s", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName()));
        Arrays.stream(fields).filter(f -> Modifier.toString(f.getModifiers()).equals(command))
                .map(fieldStringFunction)
                .forEach(System.out::println);
    }
}
