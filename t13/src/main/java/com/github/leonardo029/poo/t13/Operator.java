package com.github.leonardo029.poo.t13;

public class Operator {
    
    public static void main(String[] args){

        int x=10, y=5;

        System.out.println("\nAssignment operator types:\n");
        System.out.println("X = " + x + " e Y = " + y);
        System.out.print("X += Y: ");
        System.out.println(x+=y);
        x=10; y=5;
        System.out.print("X -= Y: ");
        System.out.println(x-=y);
        x=10; y=5;
        System.out.print("X *= Y: ");
        System.out.println(x*=y);
        x=10; y=5;
        System.out.print("X /= Y: ");
        System.out.println(x/=y);
        x=10; y=5;
        System.out.print("X %= Y: ");
        System.out.println(x%=y);
        x=10; y=5;
        System.out.print("X &= Y: ");
        System.out.println(x&=y);
        x=10; y=5;
        System.out.print("X |= Y: ");
        System.out.println(x|=y);
        x=10; y=5;
        System.out.print("X ^= Y: ");
        System.out.println(x^=y);
        x=10; y=5;
        System.out.print("X >>= Y: ");
        System.out.println(x>>=y);
        x=10; y=5;
        System.out.print("X <<= Y: ");
        System.out.println(x<<=y);
        x=10; y=5;

    }
}
