
package WorkingWithAbstractionEX.greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        HashMap<String, LinkedHashMap<String, Integer>> bag = new LinkedHashMap<>();
        String contentOfSafe = "";

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            int amount = Integer.parseInt(safe[i + 1]);


            contentOfSafe = fillingContent(name, contentOfSafe);

            if (checkingIfBagIsEmpty(input, bag, amount, contentOfSafe)) {
                continue;
            }

            if (sortingContentOfBag(bag, amount, contentOfSafe)) {
                continue;
            }

            isItemExistsInTheBag(bag, contentOfSafe);

            addingNewItemsToTheBag(bag, name, contentOfSafe);

            bag.get(contentOfSafe).put(name, bag.get(contentOfSafe).get(name) + amount);

        }

        printer(bag);
    }

    private static boolean checkingIfBagIsEmpty(int input, HashMap<String, LinkedHashMap<String, Integer>> bag, int amount, String contentOfSafe) {
        if (contentOfSafe.equals("")) {
            return true;
        }
        return isInputBiggerThanBagAmount(input, bag, amount);
    }

    private static void addingNewItemsToTheBag(HashMap<String, LinkedHashMap<String, Integer>> bag, String name, String contentOfSafe) {
        if (!bag.get(contentOfSafe).containsKey(name)) {
            bag.get(contentOfSafe).put(name, 0);
        }
    }

    private static void isItemExistsInTheBag(HashMap<String, LinkedHashMap<String, Integer>> bag, String contentOfSafe) {
        if (!bag.containsKey(contentOfSafe)) {
            bag.put(contentOfSafe, new LinkedHashMap<>());
        }
    }

    private static void printer(HashMap<String, LinkedHashMap<String, Integer>> bag) {
        for (var item : bag.entrySet()) {
            int sumValues = item.getValue().values().stream().mapToInt(l -> l).sum();

            System.out.printf("<%s> $%s%n", item.getKey(), sumValues);

            item.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean sortingContentOfBag(HashMap<String, LinkedHashMap<String, Integer>> bag, int amount, String contentOfSafe) {
        switch (contentOfSafe) {
            case "Gem":
                if (!bag.containsKey(contentOfSafe)) {
                    if (bag.containsKey("Gold")) {
                        if (isGold(bag, amount)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (isGold(bag, getBagContent(bag, amount, contentOfSafe))) {
                    return true;
                }
                break;
            case "Cash":
                if (!bag.containsKey(contentOfSafe)) {
                    if (bag.containsKey("Gem")) {
                        if (isGold(bag, amount)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (getBagContent(bag, amount, contentOfSafe) > bag.get("Gem").values().stream().mapToInt(e -> e).sum()) {
                    return true;
                }
                break;
        }
        return false;
    }

    private static String fillingContent(String name, String contentOfSafe) {
        if (name.length() == 3) {
            contentOfSafe = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            contentOfSafe = "Gem";
        } else if (name.equalsIgnoreCase("gold")) {
            contentOfSafe = "Gold";
        }
        return contentOfSafe;
    }

    private static boolean isInputBiggerThanBagAmount(int input, HashMap<String, LinkedHashMap<String, Integer>> bag, int amount) {
        return input < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToInt(e -> e).sum() + amount;
    }

    private static boolean isGold(HashMap<String, LinkedHashMap<String, Integer>> bag, int amount) {
        return amount > bag.get("Gold").values().stream().mapToInt(e -> e).sum();
    }

    private static int getBagContent(HashMap<String, LinkedHashMap<String, Integer>> bag, int amount, String contentOfSafe) {
        return bag.get(contentOfSafe).values().stream().mapToInt(e -> e).sum() + amount;
    }
}