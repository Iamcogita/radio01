package oop.morning_radio;
import static oop.morning_radio.Songs.*;
public class Main {

    public static void main(String[] args) {

        MorningRadio radio01 = new MorningRadio(10);
        radio01.playRadioForDays(4, SUNDAY);
    }
}