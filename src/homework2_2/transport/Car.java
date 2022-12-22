package homework2_2.transport;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Car {
    protected final String brand = "Lada";
    protected final String model = "Granta";
    protected Double engineVolume;
    protected String color;
    protected final Integer year = 2015;
    protected final String country = "Russia";
    protected String transmission;
    protected final Integer numberOfSeats = 4;
    protected final String bodyType = "body type";
    protected String registrationNumber;
//    protected String tireType;
//    protected Integer airTemperature;
//    protected Integer monthNumber;

    public static class Key {
        protected Boolean remoteEngineStart;
        protected Boolean keylessEntry;

        public Key(Boolean remoteEngineStart, Boolean keylessEntry) {
            if (remoteEngineStart == null) {
                this.remoteEngineStart = false;
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessEntry == null) {
                this.keylessEntry = false;
            } else {
                this.keylessEntry = keylessEntry;
            }
        }

        public Boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public Boolean getKeylessEntry() {
            return keylessEntry;
        }
    }

    public static class Insurance {
        protected Integer termOfTheInsurance;
        protected Integer costOfInsurance;
        protected String insuranceNumber;

        public Insurance(Integer termOfTheInsurance, Integer costOfInsurance, String insuranceNumber) {
            if (termOfTheInsurance == null) {
                System.out.println("Некорректно введены данные");
            } else {
                this.termOfTheInsurance = termOfTheInsurance;
            }
            if (costOfInsurance == null) {
                System.out.println("Некорректно введены данные");
            } else {
                this.costOfInsurance = costOfInsurance;
            }
            if (insuranceNumber.length() >= 9) {
                this.insuranceNumber = insuranceNumber;
            } else {
                this.insuranceNumber = null;
            }
                   }
        public Integer getTermOfTheInsurance() {
            return termOfTheInsurance;
        }

        public Integer getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getInsuranceNumber() {

            return insuranceNumber;
        }
            @Override
            public String toString () {
                return "Длительность страховки "
                        + termOfTheInsurance + " дней" +
                        ", стоимость страховки составила " + costOfInsurance +
                        " рублей, номер страховки " + insuranceNumber + ".";
            }
        }
    public Car(String brand, String model, Double engineVolume,
               String color, Integer year, String country, String transmission, Integer numberOfSeats,
               String bodyType, String registrationNumber) {

        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
    }
    public String getTransmission() {
        return transmission;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }
    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "white";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
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
public static void seasoneTireTypes() {

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
    @Override
    public String toString() {
        return "Машина - " + this.brand +
                " " + this.model +
                ", с мощность двигателя - " + this.engineVolume +
                ", цвет - " + this.color +
                ", год производства - " + this.year +
                ", страна производитель - " + this.country;
    }

}
