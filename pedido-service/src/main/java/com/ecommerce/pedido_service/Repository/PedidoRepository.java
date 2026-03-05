package com.ecommerce.pedido_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.pedido_service.Model.Pedido;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Long> {
    
}
