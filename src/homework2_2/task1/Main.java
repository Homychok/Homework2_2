package homework2_2.task1;
import homework2_2.transport.Car;

import static homework2_2.transport.Car.periodOfInsurance;
import static homework2_2.transport.Car.seasoneTireTypes;

public class Main {

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

