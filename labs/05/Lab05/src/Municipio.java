
public class Municipio {
    String region;
    int cod_depa;
    String departamento;
    double cod_muni;
    String municipio;

    public Municipio(String region, int cod_depa, String departamento, double cod_muni, String municipio) {
        this.region = region;
        this.cod_depa = cod_depa;
        this.departamento = departamento;
        this.cod_muni = cod_muni;
        this.municipio = municipio;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
}
