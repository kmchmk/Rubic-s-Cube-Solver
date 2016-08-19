package rubiccube;

import java.awt.Color;

public class Operation {

    void WhiteCross(Cube CO) {
//first finish the bottom down whites
        if (CO.Down.MiddleUp.Colour == Color.white) {
            if (CO.Front.MiddleDown.Colour == Color.red) {
                CO.F();
                CO.F();
            } else if (CO.Front.MiddleDown.Colour == Color.orange) {
                CO.D();
                CO.D();
                CO.B();
                CO.B();
            } else if (CO.Front.MiddleDown.Colour == Color.blue) {
                CO.D();
                CO.R();
                CO.R();
            } else if (CO.Front.MiddleDown.Colour == Color.green) {
                CO.D_inv();
                CO.L();
                CO.L();
            } else {
                System.out.println("Something wrong");
            }
        }
        if (CO.Down.LeftMiddle.Colour == Color.white) {
            if (CO.Left.MiddleDown.Colour == Color.red) {
                CO.D_inv();
                CO.F();
                CO.F();
            } else if (CO.Left.MiddleDown.Colour == Color.orange) {
                CO.D();
                CO.B();
                CO.B();
            } else if (CO.Left.MiddleDown.Colour == Color.blue) {
                CO.R();
                CO.R();
            } else if (CO.Left.MiddleDown.Colour == Color.green) {
                CO.D();
                CO.D();
                CO.L();
                CO.L();
            } else {
                System.out.println("Something wrong");
            }
        }
        if (CO.Down.MiddleDown.Colour == Color.white) {
            if (CO.Back.MiddleDown.Colour == Color.red) {
                CO.D();
                CO.D();
                CO.F();
                CO.F();
            } else if (CO.Back.MiddleDown.Colour == Color.orange) {
                CO.B();
                CO.B();
            } else if (CO.Back.MiddleDown.Colour == Color.blue) {
                CO.D_inv();
                CO.R();
                CO.R();
            } else if (CO.Back.MiddleDown.Colour == Color.green) {
                CO.D();
                CO.D();
                CO.L();
                CO.L();
            } else {
                System.out.println("Something wrong");
            }
        }
        if (CO.Down.RightMiddle.Colour == Color.white) {
            if (CO.Right.MiddleDown.Colour == Color.red) {
                CO.D();
                CO.F();
                CO.F();
            } else if (CO.Right.MiddleDown.Colour == Color.orange) {
                CO.D_inv();
                CO.B();
                CO.B();
            } else if (CO.Right.MiddleDown.Colour == Color.blue) {
                CO.D();
                CO.D();
                CO.R();
                CO.R();
            } else if (CO.Right.MiddleDown.Colour == Color.green) {
                CO.L();
                CO.L();
            } else {
                System.out.println("Something wrong");
            }
        }
//then finish bottom side whites
        if (CO.Front.MiddleDown.Colour == Color.white) {
            if (CO.Down.MiddleUp.Colour == Color.red) {
                CO.D();
                CO.R();
                CO.F_inv();
                CO.R_inv();
            } else if (CO.Down.MiddleUp.Colour == Color.blue) {
                CO.F_inv();
                CO.R();
                CO.F();
            } else if (CO.Down.MiddleUp.Colour == Color.green) {
                CO.F();
                CO.L_inv();
                CO.F_inv();
            } else if (CO.Down.MiddleUp.Colour == Color.orange) {
                CO.D();
                CO.R_inv();
                CO.B();
                CO.R();
            } else {
                System.out.println("Something wrong");
            }
        }
        if (CO.Right.MiddleDown.Colour == Color.white) {
            if (CO.Down.LeftMiddle.Colour == Color.red) {
                CO.R();
                CO.F_inv();
                CO.R_inv();
            } else if (CO.Down.LeftMiddle.Colour == Color.blue) {
                CO.D_inv();
                CO.F_inv();
                CO.R();
                CO.F();
            } else if (CO.Down.LeftMiddle.Colour == Color.green) {
                CO.D_inv();
                CO.F();
                CO.L_inv();
                CO.F_inv();
            } else if (CO.Down.LeftMiddle.Colour == Color.orange) {
                CO.R_inv();
                CO.B();
                CO.R();
            } else {
                System.out.println("Something wrong");
            }
        }
        if (CO.Back.MiddleDown.Colour == Color.white) {
            if (CO.Down.MiddleDown.Colour == Color.red) {
                CO.D_inv();
                CO.R();
                CO.F_inv();
                CO.R_inv();
            } else if (CO.Down.MiddleDown.Colour == Color.blue) {
                CO.B();
                CO.R_inv();
                CO.B_inv();
            } else if (CO.Down.MiddleDown.Colour == Color.green) {
                CO.B_inv();
                CO.L();
                CO.B();
            } else if (CO.Down.MiddleDown.Colour == Color.orange) {
                CO.D_inv();
                CO.R_inv();
                CO.B();
                CO.R();
            } else {
                System.out.println("Something wrong");
            }
        }
        if (CO.Left.MiddleDown.Colour == Color.white) {
            if (CO.Down.LeftMiddle.Colour == Color.red) {
                CO.L_inv();
                CO.F();
                CO.L();
            } else if (CO.Down.LeftMiddle.Colour == Color.blue) {
                CO.D();
                CO.F_inv();
                CO.R();
                CO.F();
            } else if (CO.Down.LeftMiddle.Colour == Color.green) {
                CO.D();
                CO.F();
                CO.L_inv();
                CO.F_inv();
            } else if (CO.Down.LeftMiddle.Colour == Color.orange) {
                CO.L();
                CO.B_inv();
                CO.L_inv();
            } else {
                System.out.println("Something wrong");
            }
        }

        //then finish the middle layer whites
        if (CO.Front.RightMiddle.Colour == Color.white) {
            if (CO.Right.LeftMiddle.Colour == Color.red) {
                CO.R_inv();
                CO.D_inv();
                CO.R();
                CO.F();
                CO.F();
            }
            if (CO.Right.LeftMiddle.Colour == Color.orange) {
CO.R_inv();
                CO.D();
                CO.R();
                CO.B();
                CO.B();
            }
            if (CO.Right.LeftMiddle.Colour == Color.blue) {
                CO.R();       
            }
            if (CO.Right.LeftMiddle.Colour == Color.green) {
CO.R_inv();
                CO.D_inv();
                CO.D_inv();
                CO.R();
                CO.L();
                CO.L();
            }

        }
    }
}
