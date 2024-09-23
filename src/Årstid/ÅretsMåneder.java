package Årstid;

public enum ÅretsMåneder {
    JANUAR(1),
    FEBRUAR(2),
    MARTS(3),
    APRIL(4),
    MAJ(5),
    JUNI(6),
    JULI(7),
    AUGUST(8),
    SEPTEMBER(9),
    OKTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    final int månedNummer;
    ÅretsMåneder(int månedNummer){
        this.månedNummer = månedNummer;
    }
}
