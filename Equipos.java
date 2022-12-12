public class Equipos {
    int idEquipos;
    String Nombre;
    int V;
    int P;
    String Porcentaje;
    float PD;
    String Inicio;
    String Visitante;
    String Div;
    float PPg;
    float OOP;

    public Equipos(int idEquipos, String Nombre, int V, int P, String Porcentaje, float PD, String Inicio, String Visitante, String Div,  float PPg, float OOP) {
        this.idEquipos = idEquipos;
        this.Nombre = Nombre;
        this.V = V;
        this.P = P;
        this.Porcentaje = Porcentaje;
        this.PD = PD;
        this.Inicio = Inicio;
        this.Visitante = Visitante;
        this.Div = Div;
        this.PPg = PPg;
        this.OOP = OOP;
    }

    
    
    public int getIdEquipos() {
        return idEquipos;
    }
    public void setIdEquipos(int idEquipos) {
        this.idEquipos = idEquipos;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getV() {
        return V;
    }
    public void setV(int v) {
        V = v;
    }
    public int getP() {
        return P;
    }
    public void setP(int p) {
        P = p;
    }
    public String getPorcentaje() {
        return Porcentaje;
    }
    public void setPorcentaje(String porcentaje) {
        Porcentaje = porcentaje;
    }
    public float getPD() {
        return PD;
    }
    public void setPD(float pD) {
        PD = pD;
    }
    public String getInicio() {
        return Inicio;
    }
    public void setInicio(String inicio) {
        Inicio = inicio;
    }
    public String getVisitante() {
        return Visitante;
    }
    public void setVisitante(String visitante) {
        Visitante = visitante;
    }
    public String getDiv() {
        return Div;
    }
    public void setDiv(String div) {
        Div = div;
    }
    public float getPPg() {
        return PPg;
    }
    public void setPPg(float pPg) {
        PPg = pPg;
    }
    public float getOOP() {
        return OOP;
    }
    public void setOOP(float oOP) {
        OOP = oOP;
    }
}