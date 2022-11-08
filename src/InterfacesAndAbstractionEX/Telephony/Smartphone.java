package InterfacesAndAbstractionEX.Telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {

        StringBuilder stringBuilder = new StringBuilder();

        for (String url : urls) {
            if (hasDigits(url)){
                stringBuilder.append("Invalid URL!").append(System.lineSeparator());
            } else {
                stringBuilder.append(String.format("Browsing: %s!%n", url));
            }
        }

        return stringBuilder.toString().trim();
    }
    private boolean hasDigits(String url){
        for (char singleChar : url.toCharArray()) {
            if (Character.isDigit(singleChar)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String call() {

        StringBuilder stringBuilder = new StringBuilder();

        for (String number : numbers) {
            if (hasOnlyDigits(number)){
                stringBuilder.append(String.format("Calling... %s!%n", number));
            } else {
                stringBuilder.append("Invalid number!").append(System.lineSeparator());
            }
        }

        return stringBuilder.toString().trim();
    }
    private boolean hasOnlyDigits(String number){
        for (char singleChar : number.toCharArray()) {
            if (!Character.isDigit(singleChar)){
                return false;
            }
        }
        return true;
    }
}
