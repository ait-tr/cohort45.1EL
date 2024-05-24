package classwork2405.example02;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Доп задание: написать юнит-тесты для TabHistory
        TabHistory tabHistory = new TabHistory("https://www.google.com/");
        tabHistory.goToPage("https://www.google.com/search?q=java");
        tabHistory.goToPage("https://www.w3schools.com/java/");
        tabHistory.goToPage("https://www.w3schools.com/java/java_oop.asp");
        System.out.println(tabHistory.getCurrentPage()); // w3 java oop
        tabHistory.goBack();
        tabHistory.goBack();
        System.out.println(tabHistory.getCurrentPage()); // google search java
        tabHistory.goToPage("https://www.oracle.com/java/technologies/downloads/");
        System.out.println(tabHistory.getCurrentPage()); // oracle downloads
        tabHistory.goBack();
        System.out.println(tabHistory.getCurrentPage()); // google search java
        tabHistory.goForward();
        System.out.println(tabHistory.getCurrentPage()); // oracle downloads

    }
}
