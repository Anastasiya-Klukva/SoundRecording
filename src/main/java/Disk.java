import tracks.ClassicTrack;
import tracks.JazzTrack;
import tracks.PopTrack;
import tracks.Track;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Disk {
    private List<Track> tracks;

    public Disk(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public List<ClassicTrack> getClassicTrackList() {
        List<ClassicTrack> arrayList = new ArrayList<>();
        for (Track track : this.tracks) {
            if (track instanceof ClassicTrack) {
                arrayList.add((ClassicTrack) track);
            }
        }
        return arrayList;
    }

    public List<JazzTrack> getJazzTrackList() {
        List<JazzTrack> arrayList = new ArrayList<>();
        for (Track track : this.tracks) {
            if (track instanceof JazzTrack) {
                arrayList.add((JazzTrack) track);
            }
        }
        return arrayList;
    }

    public List<PopTrack> getPopTrackList() {
        List<PopTrack> arrayList = new ArrayList<>();
        for (Track track : this.tracks) {
            if (track instanceof PopTrack) {
                arrayList.add((PopTrack) track);
            }
        }
        return arrayList;
    }
    public Disk sortByLength(){
        Collections.sort(tracks);
        return this;
    }

    public int countTotalTime(){
        int count = 0;
        for (Track track : tracks) {
            count += track.getLengthMin();
        }
        return count;
    }


}
