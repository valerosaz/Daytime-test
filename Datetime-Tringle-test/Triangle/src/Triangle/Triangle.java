package Triangle;
public class Triangle {

    public static Type classify(final int a, final int b, final int c) {
        int tri_state;
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            return Type.INVALID;
        }
        tri_state = 0;
        if (a == b) {
            tri_state = tri_state + 1;
        }
        if (a == c) {
            tri_state = tri_state + 2;
        }
        if (b == c) {
            tri_state = tri_state + 3;
        }
        if (tri_state == 0) {
            if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
                return Type.INVALID;
            } else {
                return Type.SCALENE;
            }
        }
        if (tri_state > 3) {
            return Type.EQUILATERAL;
        }
        if ((tri_state == 1) && ((a + b) > c)) {
            return Type.ISOSCELES;
        } else if ((tri_state == 2) && ((a + c) > b)) {
            return Type.ISOSCELES;
        } else if ((tri_state == 3) && ((b + c) > a)) {
            return Type.ISOSCELES;
        }
        return Type.INVALID;
    }

}