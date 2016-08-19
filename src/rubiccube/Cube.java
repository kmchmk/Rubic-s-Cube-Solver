package rubiccube;

import java.awt.Color;

public class Cube {

    Face Up = new Face();
    Face Down = new Face();
    Face Left = new Face();
    Face Right = new Face();
    Face Front = new Face();
    Face Back = new Face();

    void R() {
        System.out.println("R");
        Color temp = this.Front.RightUp.Colour;
        this.Front.RightUp.Colour = this.Down.RightUp.Colour;
        this.Down.RightUp.Colour = this.Back.LeftDown.Colour;
        this.Back.LeftDown.Colour = this.Up.RightUp.Colour;
        this.Up.RightUp.Colour = temp;

        temp = this.Front.RightDown.Colour;
        this.Front.RightDown.Colour = this.Down.RightDown.Colour;
        this.Down.RightDown.Colour = this.Back.LeftUp.Colour;
        this.Back.LeftUp.Colour = this.Up.RightDown.Colour;
        this.Up.RightDown.Colour = temp;

        temp = this.Front.RightMiddle.Colour;
        this.Front.RightMiddle.Colour = this.Down.RightMiddle.Colour;
        this.Down.RightMiddle.Colour = this.Back.LeftMiddle.Colour;
        this.Back.LeftMiddle.Colour = this.Up.RightMiddle.Colour;
        this.Up.RightMiddle.Colour = temp;

        temp = this.Right.LeftUp.Colour;
        this.Right.LeftUp.Colour = this.Right.LeftDown.Colour;
        this.Right.LeftDown.Colour = this.Right.RightDown.Colour;
        this.Right.RightDown.Colour = this.Right.RightUp.Colour;
        this.Right.RightUp.Colour = temp;

        temp = this.Right.MiddleUp.Colour;
        this.Right.MiddleUp.Colour = this.Right.LeftMiddle.Colour;
        this.Right.LeftMiddle.Colour = this.Right.MiddleDown.Colour;
        this.Right.MiddleDown.Colour = this.Right.RightMiddle.Colour;
        this.Right.RightMiddle.Colour = temp;
    }

    void L() {
        System.out.println("L");
        Color temp = this.Front.LeftDown.Colour;
        this.Front.LeftDown.Colour = this.Up.LeftDown.Colour;
        this.Up.LeftDown.Colour = this.Back.RightUp.Colour;
        this.Back.RightUp.Colour = this.Down.LeftDown.Colour;
        this.Down.LeftDown.Colour = temp;

        temp = this.Front.LeftUp.Colour;
        this.Front.LeftUp.Colour = this.Up.LeftUp.Colour;
        this.Up.LeftUp.Colour = this.Back.RightDown.Colour;
        this.Back.RightDown.Colour = this.Down.LeftUp.Colour;
        this.Down.LeftUp.Colour = temp;

        temp = this.Front.LeftMiddle.Colour;
        this.Front.LeftMiddle.Colour = this.Up.LeftMiddle.Colour;
        this.Up.LeftMiddle.Colour = this.Back.RightMiddle.Colour;
        this.Back.RightMiddle.Colour = this.Down.LeftMiddle.Colour;
        this.Down.LeftMiddle.Colour = temp;

        temp = this.Left.RightDown.Colour;
        this.Left.RightDown.Colour = this.Left.RightUp.Colour;
        this.Left.RightUp.Colour = this.Left.LeftUp.Colour;
        this.Left.LeftUp.Colour = this.Left.LeftDown.Colour;
        this.Left.LeftDown.Colour = temp;

        temp = this.Left.MiddleDown.Colour;
        this.Left.MiddleDown.Colour = this.Left.RightMiddle.Colour;
        this.Left.RightMiddle.Colour = this.Left.MiddleUp.Colour;
        this.Left.MiddleUp.Colour = this.Left.LeftMiddle.Colour;
        this.Left.LeftMiddle.Colour = temp;
    }

    void R_inv() {
        System.out.println("R'");
        Color temp = this.Front.RightDown.Colour;
        this.Front.RightDown.Colour = this.Up.RightDown.Colour;
        this.Up.RightDown.Colour = this.Back.LeftUp.Colour;
        this.Back.LeftUp.Colour = this.Down.RightDown.Colour;
        this.Down.RightDown.Colour = temp;

        temp = this.Front.RightUp.Colour;
        this.Front.RightUp.Colour = this.Up.RightUp.Colour;
        this.Up.RightUp.Colour = this.Back.LeftDown.Colour;
        this.Back.LeftDown.Colour = this.Down.RightUp.Colour;
        this.Down.RightUp.Colour = temp;

        temp = this.Front.RightMiddle.Colour;
        this.Front.RightMiddle.Colour = this.Up.RightMiddle.Colour;
        this.Up.RightMiddle.Colour = this.Back.LeftMiddle.Colour;
        this.Back.LeftMiddle.Colour = this.Down.RightMiddle.Colour;
        this.Down.RightMiddle.Colour = temp;

        temp = this.Right.LeftDown.Colour;
        this.Right.LeftDown.Colour = this.Right.LeftUp.Colour;
        this.Right.LeftUp.Colour = this.Right.RightUp.Colour;
        this.Right.RightUp.Colour = this.Right.RightDown.Colour;
        this.Right.RightDown.Colour = temp;

        temp = this.Right.MiddleDown.Colour;
        this.Right.MiddleDown.Colour = this.Right.LeftMiddle.Colour;
        this.Right.LeftMiddle.Colour = this.Right.MiddleUp.Colour;
        this.Right.MiddleUp.Colour = this.Right.RightMiddle.Colour;
        this.Right.RightMiddle.Colour = temp;
    }

    void L_inv() {
        System.out.println("L'");
        Color temp = this.Front.LeftUp.Colour;
        this.Front.LeftUp.Colour = this.Down.LeftUp.Colour;
        this.Down.LeftUp.Colour = this.Back.RightDown.Colour;
        this.Back.RightDown.Colour = this.Up.LeftUp.Colour;
        this.Up.LeftUp.Colour = temp;

        temp = this.Front.LeftDown.Colour;
        this.Front.LeftDown.Colour = this.Down.LeftDown.Colour;
        this.Down.LeftDown.Colour = this.Back.RightUp.Colour;
        this.Back.RightUp.Colour = this.Up.LeftDown.Colour;
        this.Up.LeftDown.Colour = temp;

        temp = this.Front.LeftMiddle.Colour;
        this.Front.LeftMiddle.Colour = this.Down.LeftMiddle.Colour;
        this.Down.LeftMiddle.Colour = this.Back.RightMiddle.Colour;
        this.Back.RightMiddle.Colour = this.Up.LeftMiddle.Colour;
        this.Up.LeftMiddle.Colour = temp;

        temp = this.Left.RightUp.Colour;
        this.Left.RightUp.Colour = this.Left.RightDown.Colour;
        this.Left.RightDown.Colour = this.Left.LeftDown.Colour;
        this.Left.LeftDown.Colour = this.Left.LeftUp.Colour;
        this.Left.LeftUp.Colour = temp;

        temp = this.Left.MiddleUp.Colour;
        this.Left.MiddleUp.Colour = this.Left.RightMiddle.Colour;
        this.Left.RightMiddle.Colour = this.Left.MiddleDown.Colour;
        this.Left.MiddleDown.Colour = this.Left.LeftMiddle.Colour;
        this.Left.LeftMiddle.Colour = temp;
    }

    void U() {
        System.out.println("U");
        Color temp = this.Front.RightUp.Colour;
        this.Front.RightUp.Colour = this.Right.RightUp.Colour;
        this.Right.RightUp.Colour = this.Back.RightUp.Colour;
        this.Back.RightUp.Colour = this.Left.RightUp.Colour;
        this.Left.RightUp.Colour = temp;

        temp = this.Front.LeftUp.Colour;
        this.Front.LeftUp.Colour = this.Right.LeftUp.Colour;
        this.Right.LeftUp.Colour = this.Back.LeftUp.Colour;
        this.Back.LeftUp.Colour = this.Left.LeftUp.Colour;
        this.Left.LeftUp.Colour = temp;

        temp = this.Front.MiddleUp.Colour;
        this.Front.MiddleUp.Colour = this.Right.MiddleUp.Colour;
        this.Right.MiddleUp.Colour = this.Back.MiddleUp.Colour;
        this.Back.MiddleUp.Colour = this.Left.MiddleUp.Colour;
        this.Left.MiddleUp.Colour = temp;

        temp = this.Up.RightUp.Colour;
        this.Up.RightUp.Colour = this.Up.LeftUp.Colour;
        this.Up.LeftUp.Colour = this.Up.LeftDown.Colour;
        this.Up.LeftDown.Colour = this.Up.RightDown.Colour;
        this.Up.RightDown.Colour = temp;

        temp = this.Up.MiddleUp.Colour;
        this.Up.MiddleUp.Colour = this.Up.LeftMiddle.Colour;
        this.Up.LeftMiddle.Colour = this.Up.MiddleDown.Colour;
        this.Up.MiddleDown.Colour = this.Up.RightMiddle.Colour;
        this.Up.RightMiddle.Colour = temp;
    }

    void U_inv() {
        System.out.println("U'");
        Color temp = this.Front.LeftUp.Colour;
        this.Front.LeftUp.Colour = this.Left.LeftUp.Colour;
        this.Left.LeftUp.Colour = this.Back.LeftUp.Colour;
        this.Back.LeftUp.Colour = this.Right.LeftUp.Colour;
        this.Right.LeftUp.Colour = temp;

        temp = this.Front.RightUp.Colour;
        this.Front.RightUp.Colour = this.Left.RightUp.Colour;
        this.Left.RightUp.Colour = this.Back.RightUp.Colour;
        this.Back.RightUp.Colour = this.Right.RightUp.Colour;
        this.Right.RightUp.Colour = temp;

        temp = this.Front.MiddleUp.Colour;
        this.Front.MiddleUp.Colour = this.Left.MiddleUp.Colour;
        this.Left.MiddleUp.Colour = this.Back.MiddleUp.Colour;
        this.Back.MiddleUp.Colour = this.Right.MiddleUp.Colour;
        this.Right.MiddleUp.Colour = temp;

        temp = this.Up.LeftUp.Colour;
        this.Up.LeftUp.Colour = this.Up.RightUp.Colour;
        this.Up.RightUp.Colour = this.Up.RightDown.Colour;
        this.Up.RightDown.Colour = this.Up.LeftDown.Colour;
        this.Up.LeftDown.Colour = temp;

        temp = this.Up.MiddleUp.Colour;
        this.Up.MiddleUp.Colour = this.Up.RightMiddle.Colour;
        this.Up.RightMiddle.Colour = this.Up.MiddleDown.Colour;
        this.Up.MiddleDown.Colour = this.Up.LeftMiddle.Colour;
        this.Up.LeftMiddle.Colour = temp;
    }

    void D_inv() {
        System.out.println("D'");
        Color temp = this.Front.RightDown.Colour;
        this.Front.RightDown.Colour = this.Right.RightDown.Colour;
        this.Right.RightDown.Colour = this.Back.RightDown.Colour;
        this.Back.RightDown.Colour = this.Left.RightDown.Colour;
        this.Left.RightDown.Colour = temp;

        temp = this.Front.LeftDown.Colour;
        this.Front.LeftDown.Colour = this.Right.LeftDown.Colour;
        this.Right.LeftDown.Colour = this.Back.LeftDown.Colour;
        this.Back.LeftDown.Colour = this.Left.LeftDown.Colour;
        this.Left.LeftDown.Colour = temp;

        temp = this.Front.MiddleDown.Colour;
        this.Front.MiddleDown.Colour = this.Right.MiddleDown.Colour;
        this.Right.MiddleDown.Colour = this.Back.MiddleDown.Colour;
        this.Back.MiddleDown.Colour = this.Left.MiddleDown.Colour;
        this.Left.MiddleDown.Colour = temp;

        temp = this.Down.RightDown.Colour;
        this.Down.RightDown.Colour = this.Down.LeftDown.Colour;
        this.Down.LeftDown.Colour = this.Down.LeftUp.Colour;
        this.Down.LeftUp.Colour = this.Down.RightUp.Colour;
        this.Down.RightUp.Colour = temp;

        temp = this.Down.MiddleDown.Colour;
        this.Down.MiddleDown.Colour = this.Down.LeftMiddle.Colour;
        this.Down.LeftMiddle.Colour = this.Down.MiddleUp.Colour;
        this.Down.MiddleUp.Colour = this.Down.RightMiddle.Colour;
        this.Down.RightMiddle.Colour = temp;
    }

    void D() {
        System.out.println("D");
        Color temp = this.Front.LeftDown.Colour;
        this.Front.LeftDown.Colour = this.Left.LeftDown.Colour;
        this.Left.LeftDown.Colour = this.Back.LeftDown.Colour;
        this.Back.LeftDown.Colour = this.Right.LeftDown.Colour;
        this.Right.LeftDown.Colour = temp;

        temp = this.Front.RightDown.Colour;
        this.Front.RightDown.Colour = this.Left.RightDown.Colour;
        this.Left.RightDown.Colour = this.Back.RightDown.Colour;
        this.Back.RightDown.Colour = this.Right.RightDown.Colour;
        this.Right.RightDown.Colour = temp;

        temp = this.Front.MiddleDown.Colour;
        this.Front.MiddleDown.Colour = this.Left.MiddleDown.Colour;
        this.Left.MiddleDown.Colour = this.Back.MiddleDown.Colour;
        this.Back.MiddleDown.Colour = this.Right.MiddleDown.Colour;
        this.Right.MiddleDown.Colour = temp;

        temp = this.Down.LeftDown.Colour;
        this.Down.LeftDown.Colour = this.Down.RightDown.Colour;
        this.Down.RightDown.Colour = this.Down.RightUp.Colour;
        this.Down.RightUp.Colour = this.Down.LeftUp.Colour;
        this.Down.LeftUp.Colour = temp;

        temp = this.Down.MiddleDown.Colour;
        this.Down.MiddleDown.Colour = this.Down.RightMiddle.Colour;
        this.Down.RightMiddle.Colour = this.Down.MiddleUp.Colour;
        this.Down.MiddleUp.Colour = this.Down.LeftMiddle.Colour;
        this.Down.LeftMiddle.Colour = temp;
    }

    void F() {
        System.out.println("F");
        Color temp = this.Up.LeftDown.Colour;
        this.Up.LeftDown.Colour = this.Left.RightDown.Colour;
        this.Left.RightDown.Colour = this.Down.RightUp.Colour;
        this.Down.RightUp.Colour = this.Right.LeftUp.Colour;
        this.Right.LeftUp.Colour = temp;

        temp = this.Up.RightDown.Colour;
        this.Up.RightDown.Colour = this.Left.RightUp.Colour;
        this.Left.RightUp.Colour = this.Down.LeftUp.Colour;
        this.Down.LeftUp.Colour = this.Right.LeftDown.Colour;
        this.Right.LeftDown.Colour = temp;

        temp = this.Up.MiddleDown.Colour;
        this.Up.MiddleDown.Colour = this.Left.RightMiddle.Colour;
        this.Left.RightMiddle.Colour = this.Down.MiddleUp.Colour;
        this.Down.MiddleUp.Colour = this.Right.LeftMiddle.Colour;
        this.Right.LeftMiddle.Colour = temp;

        temp = this.Front.LeftUp.Colour;
        this.Front.LeftUp.Colour = this.Front.LeftDown.Colour;
        this.Front.LeftDown.Colour = this.Front.RightDown.Colour;
        this.Front.RightDown.Colour = this.Front.RightUp.Colour;
        this.Front.RightUp.Colour = temp;

        temp = this.Front.MiddleUp.Colour;
        this.Front.MiddleUp.Colour = this.Front.LeftMiddle.Colour;
        this.Front.LeftMiddle.Colour = this.Front.MiddleDown.Colour;
        this.Front.MiddleDown.Colour = this.Front.RightMiddle.Colour;
        this.Front.RightMiddle.Colour = temp;
    }

    void F_inv() {
        System.out.println("F'");
        Color temp = this.Up.RightDown.Colour;
        this.Up.RightDown.Colour = this.Right.LeftDown.Colour;
        this.Right.LeftDown.Colour = this.Down.LeftUp.Colour;
        this.Down.LeftUp.Colour = this.Left.RightUp.Colour;
        this.Left.RightUp.Colour = temp;

        temp = this.Up.LeftDown.Colour;
        this.Up.LeftDown.Colour = this.Right.LeftUp.Colour;
        this.Right.LeftUp.Colour = this.Down.RightUp.Colour;
        this.Down.RightUp.Colour = this.Left.RightDown.Colour;
        this.Left.RightDown.Colour = temp;

        temp = this.Up.MiddleDown.Colour;
        this.Up.MiddleDown.Colour = this.Right.LeftMiddle.Colour;
        this.Right.LeftMiddle.Colour = this.Down.MiddleUp.Colour;
        this.Down.MiddleUp.Colour = this.Left.RightMiddle.Colour;
        this.Left.RightMiddle.Colour = temp;

        temp = this.Front.RightUp.Colour;
        this.Front.RightUp.Colour = this.Front.RightDown.Colour;
        this.Front.RightDown.Colour = this.Front.LeftDown.Colour;
        this.Front.LeftDown.Colour = this.Front.LeftUp.Colour;
        this.Front.LeftUp.Colour = temp;

        temp = this.Front.MiddleUp.Colour;
        this.Front.MiddleUp.Colour = this.Front.RightMiddle.Colour;
        this.Front.RightMiddle.Colour = this.Front.MiddleDown.Colour;
        this.Front.MiddleDown.Colour = this.Front.LeftMiddle.Colour;
        this.Front.LeftMiddle.Colour = temp;
    }

    void B() {
        System.out.println("B");
        Color temp = this.Up.RightUp.Colour;
        this.Up.RightUp.Colour = this.Right.RightDown.Colour;
        this.Right.RightDown.Colour = this.Down.LeftDown.Colour;
        this.Down.LeftDown.Colour = this.Left.LeftUp.Colour;
        this.Left.LeftUp.Colour = temp;

        temp = this.Up.LeftUp.Colour;
        this.Up.LeftUp.Colour = this.Right.RightUp.Colour;
        this.Right.RightUp.Colour = this.Down.RightDown.Colour;
        this.Down.RightDown.Colour = this.Left.LeftDown.Colour;
        this.Left.LeftDown.Colour = temp;

        temp = this.Up.MiddleUp.Colour;
        this.Up.MiddleUp.Colour = this.Right.RightMiddle.Colour;
        this.Right.RightMiddle.Colour = this.Down.MiddleDown.Colour;
        this.Down.MiddleDown.Colour = this.Left.LeftMiddle.Colour;
        this.Left.LeftMiddle.Colour = temp;

        temp = this.Back.LeftUp.Colour;
        this.Back.LeftUp.Colour = this.Back.LeftDown.Colour;
        this.Back.LeftDown.Colour = this.Back.RightDown.Colour;
        this.Back.RightDown.Colour = this.Back.RightUp.Colour;
        this.Back.RightUp.Colour = temp;

        temp = this.Back.MiddleUp.Colour;
        this.Back.MiddleUp.Colour = this.Back.LeftMiddle.Colour;
        this.Back.LeftMiddle.Colour = this.Back.MiddleDown.Colour;
        this.Back.MiddleDown.Colour = this.Back.RightMiddle.Colour;
        this.Back.RightMiddle.Colour = temp;
    }

    void B_inv() {
        System.out.println("B'");
        Color temp = this.Up.LeftUp.Colour;
        this.Up.LeftUp.Colour = this.Left.LeftDown.Colour;
        this.Left.LeftDown.Colour = this.Down.RightDown.Colour;
        this.Down.RightDown.Colour = this.Right.RightUp.Colour;
        this.Right.RightUp.Colour = temp;

        temp = this.Up.RightUp.Colour;
        this.Up.RightUp.Colour = this.Left.LeftUp.Colour;
        this.Left.LeftUp.Colour = this.Down.LeftDown.Colour;
        this.Down.LeftDown.Colour = this.Right.RightDown.Colour;
        this.Right.RightDown.Colour = temp;

        temp = this.Up.MiddleUp.Colour;
        this.Up.MiddleUp.Colour = this.Left.LeftMiddle.Colour;
        this.Left.LeftMiddle.Colour = this.Down.MiddleDown.Colour;
        this.Down.MiddleDown.Colour = this.Right.RightMiddle.Colour;
        this.Right.RightMiddle.Colour = temp;

        temp = this.Back.RightUp.Colour;
        this.Back.RightUp.Colour = this.Back.RightDown.Colour;
        this.Back.RightDown.Colour = this.Back.LeftDown.Colour;
        this.Back.LeftDown.Colour = this.Back.LeftUp.Colour;
        this.Back.LeftUp.Colour = temp;

        temp = this.Back.MiddleUp.Colour;
        this.Back.MiddleUp.Colour = this.Back.RightMiddle.Colour;
        this.Back.RightMiddle.Colour = this.Back.MiddleDown.Colour;
        this.Back.MiddleDown.Colour = this.Back.LeftMiddle.Colour;
        this.Back.LeftMiddle.Colour = temp;
    }
}

class Face {

    Block RightUp = new Block();
    Block RightMiddle = new Block();
    Block RightDown = new Block();
    Block LeftUp = new Block();
    Block LeftMiddle = new Block();
    Block LeftDown = new Block();
    Block MiddleUp = new Block();
    Block MiddleDown = new Block();
    Block MiddleMiddle = new Block();

}

class Block {
    Color Colour;
}
