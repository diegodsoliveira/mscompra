package com.diego.mscompra.controller;

import com.diego.mscompra.model.Pedido;
import com.diego.mscompra.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public ResponseEntity<Pedido> save(@RequestBody @Valid Pedido pedido) {
        return ResponseEntity.ok(pedidoService.save(pedido));
    }
}
