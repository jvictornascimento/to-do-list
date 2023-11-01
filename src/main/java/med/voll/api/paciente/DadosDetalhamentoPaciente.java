package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String cpf, Endereco endereço) {

    public DadosDetalhamentoPaciente (Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
    }
}
