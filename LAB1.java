/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestreams2;

public class LAB1 {
    public static void main(String[] args) {
        Circle c = new Circle();
            RedShapeDecorator redCircle = new RedShapeDecorator(c);
            RedShapeDecorator redRectangle = new RedShapeDecorator(c);
            redCircle.draw();
            redRectangle.draw();

    }
}
