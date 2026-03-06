package com.ecommerce.pedido_service.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.pedido_service.Dto.PedidoDTO;
import com.ecommerce.pedido_service.Model.Pedido;
import com.ecommerce.pedido_service.Service.PedidoService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {
    private final PedidoService pedidoService;

    @PostMapping
    public Pedido crearPedido(@RequestBody PedidoDTO request) {
        return pedidoService.crearPedido(
                request.getUsuarioId(),
                request.getProductoId(),
                request.getCantidad());
    }

}
