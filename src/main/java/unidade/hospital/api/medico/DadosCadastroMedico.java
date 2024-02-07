package unidade.hospital.api.medico;

public record DadosCadastroMedico(String nome, String email, int crm, Especialidade especialidade, String telefone,
 DadosEndereco endereco) {
} 

