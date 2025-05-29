package Extra;

import java.util.*;

public class TestDataGenerator {

    public static Object parseTestData(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Invalid Input";
        }

        Map<String, String> dataMap = new LinkedHashMap<>();
        String[] pairs = input.split(";");

        for (String pair : pairs) {
            String[] keyValue = pair.split("=", -1); // include trailing empty strings
            if (keyValue.length != 2 || keyValue[0].isEmpty()) {
                return "Invalid Input";
            }

            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            // Apply business rules
            if (key.equalsIgnoreCase("password")) {
                value = "***";
            } else if (key.equalsIgnoreCase("env")) {
                if (!value.equalsIgnoreCase("dev") && !value.equalsIgnoreCase("qa") && !value.equalsIgnoreCase("prod")) {
                    value = "unknown";
                }
            }

            dataMap.put(key, value);
        }

        System.out.println(dataMap);
        return dataMap;
    }

    // Main method to test the function
    public static void main(String[] args) {
        System.out.println(parseTestData("username=testUser;password=pass123;env=qa"));
        System.out.println(parseTestData("username=testUser;password"));
        System.out.println(parseTestData("username=testUser;env=staging"));
    }
}
