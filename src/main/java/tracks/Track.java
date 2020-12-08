package tracks;

import java.util.Objects;

abstract public class Track implements Comparable<Track>{
  String name;
  int lengthMin;

  public Track(String name, int lengthMin) {
      this.name = name;
      this.lengthMin = lengthMin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(int lengthMin) {
        this.lengthMin = lengthMin;
    }

    @Override
    public int compareTo(Track o) {
        return lengthMin - o.lengthMin;
    }

    @Override
    public String toString() {
        return " Track " + " name = '" + name + '\'' + " lengthMin : " + lengthMin + " " ;
    }

}


