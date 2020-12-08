package tracks;

import style.ClassicStyles;

import java.util.Objects;

public class ClassicTrack extends Track {
    private ClassicStyles style;

    public ClassicTrack(String name, int lengthMin, ClassicStyles style) {
        super(name, lengthMin);
        this.style = style;
    }

    public ClassicStyles getStyle() {
        return style;
    }
    @Override
    public String toString() {
        return super.toString() +  " Style : " + style.toString().toLowerCase();
    }
}


