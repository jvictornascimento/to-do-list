package med.voll.api.domain.paciente;

public record DadosListagePaciente(
        Long id,
        String nome,
        String email,
        String cpf
) {

    public DadosListagePaciente(Paciente paciente){
       this (paciente.getId(), paciente.getNome(),paciente.getEmail(),paciente.getCpf());
    }
}
