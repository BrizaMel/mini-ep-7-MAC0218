package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {
    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    lateinit var criterio : CriterioDeAprovacao

    fun defineCriterio(c : CriterioDeAprovacao) {
        this.criterio = c
    }

    fun fechaBoletim(b : Boletim) : BoletimFechado {
        return BoletimFechado(
            mediaEPs = b.mediaEPs,
            mediaMiniEPs = b.mediaMiniEPs,
            mediaFinal = criterio.mediaFinal(b),
            foiAprovado = criterio.estaAprovado(b)
        )
    }

}