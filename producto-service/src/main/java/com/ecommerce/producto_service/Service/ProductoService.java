package com.ecommerce.producto_service.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.producto_service.Model.Producto;
import com.ecommerce.producto_service.Repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // genera el constructor con los campos finales
public class ProductoService {
    private final ProductoRepository productoRepository;

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }
}