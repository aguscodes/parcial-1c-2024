package hospital;



public class Receta {
    int id;
    Paciente paciente;
    Profesional medico;
    String estaProcesada;
    Estudio[] estudios;

    public Receta(Paciente paciente, Estudio[] estudios) {
        this.paciente = paciente;
        this.estudios = estudios;
        this.estaProcesada = "PENDIENTE";
    }

    public int getId() {
        return id;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public Profesional getMedico() {
        return medico;
    }
    public String getEstaProcesada() {
        return estaProcesada;
    }
    public Estudio[] getEstudios() {
        return estudios;
    }


    public void procesar() {
        
        estaProcesada = "PROCESADA";
    
    }




    


}
