package homework2_2.transport;
import java.time.LocalDate;

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

        if (engineVolume <= 0 ) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
  /*  public Car(Integer airTemperature, Integer monthNumber, String tireType) {
        this.airTemperature = airTemperature;
        this.monthNumber = monthNumber;
        this.tireType = tireType;
        if (airTemperature <= 0 || monthNumber > 0 && monthNumber <= 3 || monthNumber >= 10 && monthNumber <= 12) {
            System.out.println("Cменить шины на сезонные");
        }
    }

    void doStuff (int t) {
        System.out.println("Сегодня температура воздуха " + t + " градусов");
    }
    public static void seasoneTiresType() {

        int airTemperature = int t;
        if ()
    }*/

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
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
/*
    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public Integer getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(Integer airTemperature) {
        this.airTemperature = airTemperature;
    }

    public Integer getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(Integer monthNumber) {
        this.monthNumber = monthNumber;
    }
*/
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
