package oop.morning_radio;

import static oop.morning_radio.Songs.*;

public class MorningRadio {

    private int songCounter;
    private boolean openTransmission = false;
    private boolean isTalker = false;
    private int maxNumberOfSongsPerDay;
    private int nextSongDay;

    MorningRadio(int maxNumberOfSongsPerDay) {
        this.maxNumberOfSongsPerDay = maxNumberOfSongsPerDay;
    }

    public void playRadioForDays(int Days, Songs weekday) {
        if (weekday == SUNDAY) {
            nextSongDay = 2;
        }
        if (weekday == MONDAY) {
            nextSongDay = 3;
        }
        if (weekday == TUESDAY) {
            nextSongDay = 4;
        }
        if (weekday == WEDNESDAY) {
            nextSongDay = 5;
        }
        if (weekday == THURSDAY) {
            nextSongDay = 6;
        }
        if (weekday == FRIDAY) {
            nextSongDay = 7;
        }
        if (weekday == SATURDAY) {
            nextSongDay = 1;
        }
        playOpeningSong(weekday);
        songCounter++;
        for (int i = 0; i < Days; i++) {
            if (nextSongDay > 7) {
                nextSongDay = 1;
            }
            if (i > 0) {
                playNextSong(nextSongDay);
                nextSongDay++;
                songCounter++;
            }
            for (int j = 0; j < maxNumberOfSongsPerDay; j++) {

                playSong((int) (Math.random() * 7) + 1);
                songCounter++;

                if (songCounter % 2 == 0) {
                    playCommercial();
                }

                if (songCounter >= maxNumberOfSongsPerDay) {
                    closingTransmission();
                    break;
                }
            }
        }
    }

    public void closingTransmission() {
        System.out.println("Closing Song.. \n ");
        songCounter = 0;
        openTransmission = false;
    }

    private void playOpeningSong(Songs weekday) {
        openTransmission();
        if (!openTransmission) {
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
        if (isTalker == true) {
            maxNumberOfSongsPerDay *= 2;
            isTalker = false;
        }
        double getHost = Math.random();
        if (getHost > 0.5) {
            talkativeModifier();
        }
    }

    private void talkativeModifier() {
        maxNumberOfSongsPerDay /= 2;
        System.out.print(" Ira Glass here, only have time for " + maxNumberOfSongsPerDay + " songs...");
        isTalker = true;
    }

    private void playNextSong(int next) {
        openTransmission();
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


    public void playCommercial() {
        double random = Math.random();
        if (random < 0.3) {
            System.out.println(Songs.COMMERCIAL02.getPlaySong());
            return;
        }
        if (random > 0.6) {
            System.out.println(Songs.COMMERCIAL01.getPlaySong());
            return;
        }
        System.out.println(Songs.COMMERCIAL03.getPlaySong());
    }

    public void playSong(int songNumber) {
        if (isTalker) {
            if (Math.random() > 0.5) {
                System.out.println(Songs.PODCAST.getPlaySong());
            }
            System.out.println(TALK_SHOW.getPlaySong());
        }
        switch (songNumber) {
            case 1 -> System.out.println(Songs.SONG_1.getPlaySong());
            case 2 -> System.out.println(Songs.SONG_2.getPlaySong());
            case 3 -> System.out.println(Songs.SONG_3.getPlaySong());
            case 4 -> System.out.println(Songs.SONG_4.getPlaySong());
            case 5 -> System.out.println(Songs.SONG_5.getPlaySong());
            case 6 -> System.out.println(Songs.SONG_6.getPlaySong());
            case 7 -> System.out.println(Songs.SONG_7.getPlaySong());
            case 8 -> System.out.println(Songs.SONG_8.getPlaySong());
        }
    }
}