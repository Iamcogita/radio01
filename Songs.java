package oop.morning_radio;

public enum Songs {

    SUNDAY("::::Sunday bloody sunday::::"),
    MONDAY("::::THUNDER! NA NA NA NA NA NA NA NA::::"),
    TUESDAY("::::and she's buying a stairway::::"),
    WEDNESDAY("::::hey jude::::"),
    THURSDAY("::::La La La La La::::"),
    FRIDAY("::::Go ask Alice, when she's ten feet tall::::"),
    SATURDAY("::::surfing USA::::"),
    SONG_1("~~~~~~~~~ Park life ~~~~~~~~~"),
    SONG_2("~~~~~~~~~ WHEN I FEEL HEAVY METAL WOO HOO! ~~~~~~~~~"),
    SONG_3("~~~~~~~~~ people are strange, when you're a stranger ~~~~~~~~~"),
    SONG_4("~~~~~~~~~ wear the grudge like a crown ~~~~~~~~~"),
    SONG_5("~~~~~~~~~ what does the fox say? ~~~~~~~~~"),

    PODCAST("................... Ira Glass here, NPR news"),
    TALK_SHOW("....................please welcome our dear guest"),

    COMMERCIAL01("((((((( BUY PEPSI )))))))"),
    COMMERCIAL02("((((((( GIVE US MONEY - CONSUME )))))))))"),
    COMMERCIAL03("(((((((((( SILLY COMMERCIAL JINGLE PLAYS ))))))))))))");

    private int id;
    private String playSong;

    Songs(String playSong) {
        this.playSong = playSong;
    }

    public String getPlaySong() {
        return this.playSong;
    }

}