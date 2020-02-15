import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        short ss = 25;
//        short b = 4;
//        short ss2 = ss*b; //promotes to int and causes syntax error!
/*
    Here are the actual rules for numeric promotion, from section 5.6.2 of the JLS:

    When an operator applies binary numeric promotion to a pair of operands
    (each of which must denote a value that is convertible to a numeric type),
    the following rules apply, in order, using widening conversion (§5.1.2) to convert operands as necessary:

    If any of the operands is of a reference type, unboxing conversion (§5.1.8) is performed. Then:
    If either operand is of type double, the other is converted to double.
    Otherwise, if either operand is of type float, the other is converted to float.
    Otherwise, if either operand is of type long, the other is converted to long.
    Otherwise, both operands are converted to type int.
*/

        System.out.print("Enter a size between 100 and 600 and I'll draw for you.. ");
        int dim = s.nextInt();
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(dim, dim);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.toFront();
        System.out.print("Enter a number.. ");
        dim = s.nextInt();
        System.exit(0);
    }
    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }

}
