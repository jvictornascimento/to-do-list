package med.voll.api.domain.usuario;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Usuario")
@Table(name="usuarios")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String login;
    private String senha;

}
