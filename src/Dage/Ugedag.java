package Dage;

public enum Ugedag {
    MANDAG(1),
    TIRSDAG(2),
    ONSDAG(3),
    TORSDAG(4),
    FREDAG(5),
    LØRDAG(6),
    SØNDAG(7);

    final int menu;

    Ugedag(int menu) { //gør at vi kan skrive en int værdi ud for vores konstanter
        this.menu = menu;
    }
}

