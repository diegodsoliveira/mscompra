package com.diego.mscompra.service;

import com.diego.mscompra.model.Pedido;
import com.diego.mscompra.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Repository
public class PedidoService {

    private PedidoRepository repository;

    public Pedido save(Pedido pedido) {
        pedido.setId(null);
        return repository.save(pedido);
    }
}
