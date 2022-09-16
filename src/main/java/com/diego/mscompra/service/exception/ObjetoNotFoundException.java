package com.diego.mscompra.service.exception;

public class ObjetoNotFoundException extends EntidadeNaoEncontradaException {

    public ObjetoNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ObjetoNotFoundException(Long id) {
        this(String.format("Objeto com o id: %s na base de dados!", id));
    }

}
