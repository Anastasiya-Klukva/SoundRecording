//ЗАДАНИЕ. Звукозапись. Определить иерархию музыкальных композиций.
// Записать на диск сборку. Подсчитать продолжительность.
// Провести перестановку композиций диска на основе принадлежности к стилю. Найти композицию, соответствующую заданному диапазону длины треков.

import style.ClassicStyles;
import style.JazzStyles;
import style.PopStyles;
import tracks.ClassicTrack;
import tracks.JazzTrack;
import tracks.PopTrack;
import tracks.Track;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {
    static List<Track> tracks = Arrays.asList(
            new ClassicTrack("Manfred", 61, ClassicStyles.SYMPHONY),
            new ClassicTrack("Faust", 220, ClassicStyles.OPERA),
            new ClassicTrack("Giselle", 145, ClassicStyles.BALLET),
            new JazzTrack("Cowboy", 3, JazzStyles.BEBOP),
            new JazzTrack("Relax", 4, JazzStyles.CONTEMPORARY),
            new JazzTrack("Bridge", 5, JazzStyles.SWING),
            new PopTrack("Europa", 3, PopStyles.EURO_DISCO),
            new PopTrack("Technical", 9, PopStyles.EURO_POP),
            new PopTrack("Nothing", 6, PopStyles.POP_ROCK)
    );
    private static Object TracksDisk;

    public static void main(String[] args) {
        Disk disk = new Disk(tracks);
        List<PopTrack> popDisk = disk.getPopTrackList();
        disk.sortByLength();
        List<Track> tracks1 = disk.getTracks();
        for (Track track : tracks1) {
            System.out.println(track.toString());
        }
        System.out.println("Total time of Disk (minutes):  " + disk.countTotalTime());
    }
}