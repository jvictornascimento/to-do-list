package med.voll.api.paciente;

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
