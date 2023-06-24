public class FestaAniversario extends Evento {
	@Override
	public void soltarMusica() {
        System.out.println("As músicas escolhidas pelo DJ para essa festa é estilo POP");
    }
	private String dono;
    private String data;
    private String horainicio;
    private String horafinal;
    private int qtdconvidados;
    
    // Getters e Setters
    public String getDono() {
        return dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getHoraInicio() {
        return horainicio;
    }
    
    public void setHoraInicio(String horainicio) {
        this.horainicio = horainicio;
    }
    
    public String getHoraFinal() {
        return horafinal;
    }
    
    public void setHoraFinal(String horafinal) {
        this.horafinal = horafinal;
    }
    
    public int getQtdConvidados() {
        return qtdconvidados;
    }
    
    public void setQtdConvidados(int qtdconvidados) {
        this.qtdconvidados = qtdconvidados;
    }
    
}

