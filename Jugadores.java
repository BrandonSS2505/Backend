public class Jugadores {
    int idjugadores;
    String Nombre;
    int J;
    int GS;
    float Min;
    float PTS;
    float OR;
    float DR;

    public Jugadores(int idjugadores, String Nombre, int J, int GS, Float Min, float PTS, float OR, float DR) {
        this.idjugadores = idjugadores;
        this.Nombre = Nombre;
        this.J = J;
        this.GS = GS;
        this.Min = Min;
        this.PTS = PTS;
        this.OR = OR;
        this.DR = DR;
    }
    

    public int getIdjugadores() {
        return idjugadores;
    }
    public void setIdjugadores(int idjugadores) {
        this.idjugadores = idjugadores;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getJ() {
        return J;
    }
    public void setJ(int j) {
        J = j;
    }
    public int getGS() {
        return GS;
    }
    public void setGS(int gS) {
        GS = gS;
    }
    public float getMin() {
        return Min;
    }
    public void setMin(float min) {
        Min = min;
    }
    public float getPTS() {
        return PTS;
    }
    public void setPTS(float pTS) {
        PTS = pTS;
    }
    public float getOR() {
        return OR;
    }
    public void setOR(float oR) {
        OR = oR;
    }
    public float getDR() {
        return DR;
    }
    public void setDR(float dR) {
        DR = dR;
    }

}