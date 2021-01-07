package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>(Arrays.asList(
                new MusicBand("Catamenia", 1995),
                new MusicBand("C-Block", 1996),
                new MusicBand("Blackmore’s Night", 1997),
                new MusicBand("Black Label Society", 1998),
                new MusicBand("Antique", 1999),
                new MusicBand("Client", 2001),
                new MusicBand("Callejon", 2002),
                new MusicBand("Brazilian Girls", 2003),
                new MusicBand("Beach House", 2004),
                new MusicBand("Caravan Palace", 2005)
        ));

        groupsAfter2000(musicBandList);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandList = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                musicBandList.add(band);
            }
        }

        return musicBandList;
    }

}
