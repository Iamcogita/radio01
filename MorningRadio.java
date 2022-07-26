package oop.morning_radio;
import static oop.morning_radio.Songs.*;

public class MorningRadio {

    private int songCounter;
    private boolean openTransmission = false;
    private boolean isTalker = false;
    private int maxNumberOfSongsPerDay;

    MorningRadio( int maxNumberOfSongsPerDay ){
         this.maxNumberOfSongsPerDay = maxNumberOfSongsPerDay;
    }

    public void playRadioForDays(int Days , Songs weekday){
        playOpeningSong(weekday);
        for (int i = 0; i < Days; i++) {
        int next = 1 ;
        playNextSong(next);
        next++;
        for (int j = 0; j < maxNumberOfSongsPerDay; j++) {
            if (songCounter % 2 == 0) {playCommercial();}
            playSong((int)(Math.random() * (5 - 1) + 1));
            if(songCounter == maxNumberOfSongsPerDay ){closingTransmission();}
            }
        }
    }

    public void closingTransmission(){
        System.out.println("Closing Song.. \n ");
        songCounter = 0;
        openTransmission = false;
    }

    private void playOpeningSong(Songs weekday) {
        openTransmission();
        if(!openTransmission){
        openTransmission = true;
            switch (weekday) {
                case SUNDAY -> System.out.println(Songs.SUNDAY.getPlaySong());
                case MONDAY -> System.out.println(Songs.MONDAY.getPlaySong());
                case TUESDAY -> System.out.println(Songs.TUESDAY.getPlaySong());
                case WEDNESDAY -> System.out.println(Songs.WEDNESDAY.getPlaySong());
                case THURSDAY -> System.out.println(Songs.THURSDAY.getPlaySong());
                case FRIDAY -> System.out.println(Songs.FRIDAY.getPlaySong());
                case SATURDAY -> System.out.println(Songs.SATURDAY.getPlaySong());
            }
        }
    }

    private void openTransmission() {
        double getHost = Math.random();
        if( getHost > 0.5 ) {
            talkativeModifier();
        }
    }

    private void talkativeModifier() {
        maxNumberOfSongsPerDay /= 2;
        isTalker = true;
    }

    private void playNextSong(int next) {
        if(next >= 7 ){ next = 1 ;}
        next++;
        songCounter++;
        switch (next) {
            case 1 -> System.out.println(Songs.SUNDAY.getPlaySong());
            case 2 -> System.out.println(Songs.MONDAY.getPlaySong());
            case 3 -> System.out.println(Songs.TUESDAY.getPlaySong());
            case 4 -> System.out.println(Songs.WEDNESDAY.getPlaySong());
            case 5 -> System.out.println(Songs.THURSDAY.getPlaySong());
            case 6 -> System.out.println(Songs.FRIDAY.getPlaySong());
            case 7 -> System.out.println(Songs.SATURDAY.getPlaySong());
            default -> throw new IllegalStateException("Unexpected value: " + next);
        }
    }


    public void playCommercial(){
        double random = Math.random();
        if(random < 0.33){
            System.out.println(Songs.COMMERCIAL02.getPlaySong());
            return ;
        }
        if(random > 0.66){
            System.out.println(Songs.COMMERCIAL01.getPlaySong());
            return ;
        }
        System.out.println(Songs.COMMERCIAL03.getPlaySong());
    }

   public void playSong(int songNumber) {
       if (isTalker) {talkativeModifier();
           if( Math.random() > 0.5){
           System.out.println(Songs.PODCAST.getPlaySong());
           }
           System.out.println(TALK_SHOW.getPlaySong());
       }
       songCounter++;
       switch (songNumber) {
           case 1 -> System.out.println(Songs.SONG_1.getPlaySong());
           case 2 -> System.out.println(Songs.SONG_2.getPlaySong());
           case 3 -> System.out.println(Songs.SONG_3.getPlaySong());
           case 4 -> System.out.println(Songs.SONG_4.getPlaySong());
           case 5 -> System.out.println(Songs.SONG_5.getPlaySong());
       }
       }
}