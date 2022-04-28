import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Prototype prototype = new Prototype(123, "Aluno Original", new Endereco("Rua A", 1), "Juiz de Fora");

        Prototype prototypeClone = prototype.clone();
        prototypeClone.setMatricula(456);
        prototypeClone.setNome("Aluno Clonado");
        prototypeClone.getEndereco().setNumero(2);

        assertEquals("Aluno{matricula=123, nome='Aluno Original', endereco=Endereco{logradouro='Rua A', numero=1}, localNascimento='Juiz de Fora'}", aluno.toString());
        assertEquals("Aluno{matricula=456, nome='Aluno Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, localNascimento='Juiz de Fora'}", alunoClone.toString());
    }
}