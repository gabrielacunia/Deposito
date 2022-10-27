
package puntos;


public class Puntos {
    int[] punto1;
    int[] punto2;

    public int[] getPunto1() {
        return punto1;
    }

    public void setPunto1(int[] punto1) {
        this.punto1 = punto1;
    }

    public int[] getPunto2() {
        return punto2;
    }

    public void setPunto2(int[] punto2) {
        this.punto2 = punto2;
    }

    public Puntos(int[] punto1, int[] punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Puntos() {
    }
}
