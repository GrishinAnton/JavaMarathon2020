package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.members.addAll(band1.members);
        band1.members.removeAll(band1.members);
    }

    public void printMembers() {
        for (String member : this.members) {
            System.out.println(member);
        }
    }

    public List<String> getMembers() {
        return this.members;
    }
}
