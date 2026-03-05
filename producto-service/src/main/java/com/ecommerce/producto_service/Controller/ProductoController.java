package com.ecommerce.producto_service.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.producto_service.Model.Producto;
import com.ecommerce.producto_service.Service.ProductoService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoController {
    
    private final ProductoService productoService;

    @PostMapping()
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }
    
    @GetMapping()
    public List<Producto> obtenerProductos () {
        return productoService.obtenerProductos();
    }
    
    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id) {
        return productoService.obtenerProductoPorId(id);
    }

}
