package tracks;

import style.PopStyles;

import java.util.Objects;

public class PopTrack extends Track {
    private PopStyles style;

    public PopTrack(String name, int lengthMin, PopStyles style) {
        super(name, lengthMin);
        this.style = style;
    }

    public PopStyles getStyle() {
        return style;
    }
    @Override
    public String toString() {
        return super.toString() + " Style : " + style.toString().toLowerCase();
    }
}


