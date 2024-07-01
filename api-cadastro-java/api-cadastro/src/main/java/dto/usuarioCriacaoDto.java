package dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public class usuarioCriacaoDto {


    private Long id;

    @NotNull(message = "O campo não pode está vazio")
    @NotBlank(message = "O campo não pode ter espaços")
    @Size(min = 2)
    private String nome;

    @NotNull(message = "O campo não pode está vazio")
    @Size(min = 3, max = 50)
    private String sobrenome;

    @NotNull(message = "O campo não pode está vazio")
    @CPF(message = "Insira um CPF valido!")
    @NotBlank(message = "O campo não pode ter espaços")
    private String cpf;

    @NotNull(message = "O campo não pode está vazio")
    @NotBlank(message = "O campo não pode ter espaços")
    @Email
    private String email;

    @NotNull
    @Size(min = 7, max = 35)
    private String senha;

}
