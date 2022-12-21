package homework2_2.task1;
import homework2_2.transport.Car;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void seasoneTireTypes() {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter local today temperature");
        int localTemperature = scanner.nextInt();

        System.out.println("Enter type of tire for your car (summer or winter)");
        String tireType = scanner.next();
        System.out.println("Enter number of month");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 0) {
            monthNumber = Math.abs(monthNumber);
        } */
        Integer monthNumber = 12;
        if (monthNumber < 0) {
            monthNumber = Math.abs(monthNumber);
        }
        Integer localTemperature = 12;
        String tireType = "summer";
        boolean seasonWinter = true;
        boolean seasonSummer = true;

        if (localTemperature <= 5 & monthNumber <= 3 | localTemperature <= 5 & monthNumber >= 10 & monthNumber <= 12) {
            seasonWinter = true;
        } else {
            seasonWinter = false;
        }
        if (localTemperature > 5 & monthNumber > 3 & monthNumber < 10) {
            seasonSummer = true;
        } else {
            seasonSummer = false;
        }
        if (tireType == "winter" & seasonWinter | tireType == "summer" & seasonSummer) {
            System.out.println("Шины подобраны под сезон");

        } else {
            System.out.println("Необходимо сменить шины на сезонные");
        }
    }

    public static void periodOfInsurance() {
        LocalDate nowadays = LocalDate.of(2022, 12, 20);
        LocalDate dateOfBuyingIns = LocalDate.of(2022, 4, 13);
        Period daysOfInsurance1 = dateOfBuyingIns.until(nowadays);
        Long daysOfInsurance2 = dateOfBuyingIns.until(nowadays, ChronoUnit.DAYS);
        Long termOfTheInsurance = Long.valueOf(365);
        Integer lessDays = (int) (termOfTheInsurance - daysOfInsurance2);
        if (termOfTheInsurance > daysOfInsurance2) {
            System.out.println("Осталось " + lessDays + " дней страховки.");
        } else {
            System.out.println("Страховка закончилась. Необходимо оформить новую!");
        }
        System.out.println("Прошло " + daysOfInsurance1 + " или " + daysOfInsurance2 + " дней со дня оформления страховки.");
    }

        public static void main(String[] args){
            Car car1 = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "transmission", 2, "body type", "ASF345S199");
            Car.Insurance insurance = new Car.Insurance(1, 1000,"456677");

            System.out.println(car1 + "\n"/* + car2 + "\n" + car3 +
                "\n" + car4 + "\n" + car5 */);
            System.out.println(insurance);
            seasoneTireTypes();
            periodOfInsurance();
        }
    }

