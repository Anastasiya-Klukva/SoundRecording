package tracks;

import style.JazzStyles;

import java.util.Objects;

public class JazzTrack extends Track {
    private JazzStyles style;

    public JazzTrack(String name,  int  lengthMin, JazzStyles style) {
        super(name, lengthMin);
        this.style = style;
    }

    public JazzStyles getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return super.toString() + " Style: " + style.toString().toLowerCase();
    }
}
