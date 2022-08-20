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
    SONG_6("~~~~~~~~~ ring ding ding ding ding ding ~~~~~~~~~"),
    SONG_7("~~~~~~~~~ hello from the other side ~~~~~~~~~"),
    SONG_8("~~~~~~~~~ point that fucking finger up your ass ~~~~~~~~~"),

    PODCAST("........ Ira Glass here ........ NPR news"),
    TALK_SHOW("......please welcome our dear guest : ... "),

    COMMERCIAL01("( - time for an ad - )"),
    COMMERCIAL02("((( CONSUME ))) ((( OBEY ))) "),
    COMMERCIAL03("( SILLY COMMERCIAL JINGLE PLAYS )");
    
    private String playSong;

    Songs(String playSong) {
        this.playSong = playSong;
    }

    public String getPlaySong() {
        return this.playSong;
    }

}