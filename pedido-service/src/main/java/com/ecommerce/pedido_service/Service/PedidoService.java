package com.ecommerce.pedido_service.Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import com.ecommerce.pedido_service.Dto.ProductoDTO;
import com.ecommerce.pedido_service.Dto.UsuarioDTO;
import com.ecommerce.pedido_service.Model.Pedido;
import com.ecommerce.pedido_service.Repository.PedidoRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    private final RestTemplate restTemplate;

    public Pedido crearPedido(Long usuarioId, Long productoId, Integer cantidad) {
        
        UsuarioDTO usuario = restTemplate.getForObject(
            "http://localhost:8081/usuarios/" + usuarioId,
            UsuarioDTO.class
        );

        if (usuario == null) {
            throw new RuntimeException("Usuario no encontrado");
        }

        ProductoDTO producto = restTemplate.getForObject(
            "http://localhost:8082/productos/" + productoId,
            ProductoDTO.class
        );
        if (producto == null) {
            throw new RuntimeException("Producto no encontrado");
        }
        Pedido pedido = Pedido.builder()
            .usuarioId(usuarioId)
            .fecha(LocalDateTime.now())
            .total(producto.getPrecio() * cantidad)
            .build();
        return pedidoRepository.save(pedido);
    }
}
