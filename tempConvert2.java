/* This is an improved version of the basic temperature converter I made in Java which can convert between celcius, farenheit and kelvin. I have made the code a bit tidier and concise, and changed the variable and method names to fit with standard Java convention. Ideally I would have also written it to take user input but decided against it because of the limitations of the Sololearn IDE. It is also only my second code written in Java so any feedback is appreciated. */

class TemperatureConverter {

    static void celciusToFarenheit(double temp) {
        double converted = 1.8 * temp + 32;
        System.out.println(String.format("%.2f", temp) + "C -> " + String.format("%.2f", converted) + "F");
    }
    
    static void farenheitToCelcius(double temp) {
        double converted = (temp - 32) / 1.8;
        System.out.println(String.format("%.2f", temp) + "F -> " + String.format("%.2f", converted) + "C");
    }
    
    static void celciusToKelvin(double temp){
        double converted = temp + 273.15;
        System.out.println(String.format("%.2f", temp) + "C -> " + String.format("%.2f", converted) + "K");
    }

    static void kelvinToCelcius(double temp) {
        double converted = temp - 273.15;
        System.out.println(String.format("%.2f", temp) + "K -> " + String.format("%.2f", converted) + "C");
    }
    
    static void farenheitToKelvin(double temp) {
        double ctemp = (temp - 32) / 1.8;
        double converted = ctemp + 273.15;
        System.out.println(String.format("%.2f", temp) + "F -> " + String.format("%.2f", converted) + "K");
    }
    
    static void kelvinToFarenheit(double temp) {
        double ctemp = temp - 273.15;
        double converted = 1.8 * ctemp + 32;
        System.out.println(String.format("%.2f", temp) + "K -> " + String.format("%.2f", converted) + "F");
    }

    public static void main(String[ ] args) {
        celciusToFarenheit(20);
        farenheitToCelcius(95);
        celciusToKelvin(-17);
        kelvinToCelcius(100);
        farenheitToKelvin(80);
        kelvinToFarenheit(273);
        
    }
}
