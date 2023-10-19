public class Asignatura {
    private String codigo;
    private String nombre;
    private int semestre;
    private int creditos;
    private String horario;

    public Asignatura(String codigo, String nombre, int semestre, int creditos, String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
