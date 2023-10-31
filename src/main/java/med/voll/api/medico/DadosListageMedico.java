package med.voll.api.medico;

public record DadosListageMedico( String nome, String Email, String crm, Especialidade especialidade) {

    public DadosListageMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getEspecialidade());
    }
}
