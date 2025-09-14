//Kailyn Kim 9/14/25

public class problemThree {
    public static void main(String[]args){
        double r = 1731000;
        double volume = 4*(3.14*(Math.pow(r,2)));
        double volMM = volume *0.001;
        double density = (volMM *3000)/1000;
        double densityMM = density*0.25;
        System.out.println(densityMM+" liters of water could be recovered from the 1 millimeter thick surface layer if 25% of the lunar surface contains water");
    }
}
