import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PortariaTest{
    val negadoMenoresDeIdade = "Entrada proibida para menores de 18 anos."
    val conviteInvalido = "Tipo de convite inválido."
    val welcome = "Welcome :)"

    @Test
    @DisplayName("Negar entrada para menores de idade.")
    fun validaMenoresDeIdade(){
        val str = portaria(15,"","")
        Assertions.assertEquals(negadoMenoresDeIdade,str)
    }

    @Test
    @DisplayName("Negar entrada para convite inválido.")
    fun validaTipoConvite(){
        val str = portaria(22,"conviteErrado","")
        Assertions.assertEquals(conviteInvalido,str)
    }

    @Test
    @DisplayName("Negar entrada para convite Comum com código inválido.")
    fun validaConviteComum(){
        val str = portaria(22,"comum","codigoErrado")
        Assertions.assertEquals(conviteInvalido,str)
    }

    @Test
    @DisplayName("Negar entrada para convite Luxo com código inválido.")
    fun validaConviteLuxo(){
        val str = portaria(22,"premium","codigoErrado")
        Assertions.assertEquals(conviteInvalido,str)
    }

    @Test
    @DisplayName("Negar entrada para convite Premium com código inválido.")
    fun validaConvitePremium(){
        val str = portaria(22,"premium","codigoErrado")
        Assertions.assertEquals(conviteInvalido,str)
    }

    @Test
    @DisplayName("Permite entrada para convite Comum com código Correto.")
    fun validaConviteComumCodigoCorreto(){
        val str = portaria(22,"comum","xtcodigo")
        Assertions.assertEquals(welcome,str)
    }

    @Test
    @DisplayName("Permite entrada para convite Luxo com código Correto.")
    fun validaConviteLuxoCodigoCorreto(){
        val str = portaria(22,"luxo","xlCodigo")
        Assertions.assertEquals(welcome,str)
    }

    @Test
    @DisplayName("Permite entrada para convite Premium com código Correto.")
    fun validaConvitePremiumCodigoCorreto(){
        val str = portaria(22,"premium","xlCodigo")
        Assertions.assertEquals(welcome,str)
    }
}