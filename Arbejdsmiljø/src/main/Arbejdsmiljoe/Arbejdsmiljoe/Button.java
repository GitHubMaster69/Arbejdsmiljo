package Arbejdsmiljoe;

import processing.core.PApplet;


public class Button extends PApplet {
    static final int W = 60, H = 40;

    final String label;
    final short x, y, xW, yH;
    boolean isHovering;

    Button(String txt, int xx, int yy) {
        label = txt;

        x = (short) xx;
        y = (short) yy;

        xW = (short) (xx + W);
        yH = (short) (yy + H);
    }

    void display() {
        rect(x, y, W, H);

        text(label, x + W/2, y + H/2);
    }

    boolean isInside() {
        return isHovering = mouseX > x & mouseX < xW & mouseY > y & mouseY < yH;
    }
}