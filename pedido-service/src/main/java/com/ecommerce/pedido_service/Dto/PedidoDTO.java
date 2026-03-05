package com.ecommerce.pedido_service.Dto;

import lombok.Data;

@Data
public class PedidoDTO {
    private Long usuarioId;
    private Long productoId;
    private Integer cantidad;
}
