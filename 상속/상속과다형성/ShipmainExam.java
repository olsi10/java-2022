package 상속.상속과다형성;

import javax.swing.*;

class Ship {
    public String Name() {
        return "배 이름";
    }
}

class Myship extends Ship {
    public String Name() {
        return "해적선";
    }
}

class Yourship extends Ship {
    public String Name() {
        return "타이타닉호";
    }
}

class ShipName {
    public static void search(Ship s) {
        if(s instanceof Myship) {
            Myship b = (Myship)s;
            System.out.println("Myship" + b.Name());
        }
        else if(s instanceof Yourship) {
            Yourship b = (Yourship)s;
            System.out.println("Yourship" + b.Name());
        }
    }
}

public class ShipmainExam {
    public static void main(String[] args) {
        Ship myShip = new Myship();
        Ship yourship = new Yourship();
        ShipName.search(myShip);
        ShipName.search(yourship);
    }
}

