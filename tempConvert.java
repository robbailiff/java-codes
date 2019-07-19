/* This is a basic temperature converter that can convert between celcius, farenheit and kelvin. Ideally I would have also written it to take user input but decided against it because of the limitations of the Sololearn IDE. It is also my first code written in Java so any feedback is appreciated. */

class TemperatureConverter {

    static double celcius_to_f(double temp) {
        return 1.8 * temp + 32;
    }
    
    static double farenheit_to_c(double temp) {
        return (temp - 32) / 1.8;
    }
    
    static double c_to_kelvin(double temp){
        return temp + 273.15;
    }

    static double kelvin_to_c(double temp) {
        return temp - 273.15;
    }
    
    static double farenheit_to_k(double temp) {
        double ctemp = farenheit_to_c(temp);
        return ctemp + 273.15;
    }
    
    static double kelvin_to_f(double temp) {
        double ctemp = temp - 273.15;
        double ftemp = celcius_to_f(ctemp);
        return ftemp;
    }

    public static void main(String[ ] args) {
        double a = celcius_to_f(20);
        String c2f = String.format("%.2f",a);
        double b = farenheit_to_c(95);
        String f2c = String.format("%.2f",b);
        double c = c_to_kelvin(-17);
        String c2k = String.format("%.2f",c);
        double d = kelvin_to_c(100);
        String k2c = String.format("%.2f",d);
        double e = farenheit_to_k(80);
        String f2k = String.format("%.2f",e);
        double f = kelvin_to_f(273);
        String k2f = String.format("%.2f",f);
        
        System.out.println("20C -> " + c2f + "F");
        System.out.println("95F -> " + f2c + "C");
        System.out.println("-17C -> " + c2k + "K");
        System.out.println("100K -> " + k2c + "C");
        System.out.println("80F -> " + f2k + "K");
        System.out.println("273K -> " + k2f + "F");
    }
}
