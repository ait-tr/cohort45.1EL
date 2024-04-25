package enums;
/*
@date 25.04.2024
@author Sergey Bugaienko
*/

public class SeasonApp {
    public static void main(String[] args) {
        Season[] seasons = Season.values();

        for (int i = 0; i < seasons.length; i++) {
            Season currentSeason = seasons[i];
            System.out.println(currentSeason.getName() + " has an average temperature of " +
                    currentSeason.getAvgTemperature() + "C");

        }

        String string = "WINTER";

        Season season = Season.valueOf(string);

        System.out.println(season.getAvgTemperature());
    }
}
