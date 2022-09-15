package com.diego.mscompra.controller;

import com.diego.mscompra.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    public ResponseEntity<Pedido> save(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(pedido);
    }
}
