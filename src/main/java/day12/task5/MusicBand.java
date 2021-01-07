package day12.task5;

import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.members.addAll(band1.members);
        band1.members.removeAll(band1.members);
    }

    public void printMembers() {
        for (MusicArtist member : this.members) {
            System.out.println(member.getName());
        }
    }

    public List<MusicArtist> getMembers() {
        return this.members;
    }
}
