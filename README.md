# POO---Desafio
____
## Criar diagrama de fluxo com Mermaid
```mermaid
classDiagram
    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet
    class ReprodutorMusical{
        +tocar()
        +pausar()
        +selecionarMusicar(String muisca)
    }
    class AparelhoTelefonico{
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet{
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
