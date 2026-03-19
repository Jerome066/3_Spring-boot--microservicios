package com.Ecommerce.usuario_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data // Sirve para generar automáticamente los métodos getters, setters, toString, equals y hashCode

@Table(name = "usuarios") // Especifica el nombre de la tabla en la base de datos
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente el ID del usuario
    private Long id;
    private String nombre;

    @Column(unique = true) // Asegura que el correo electrónico (no repetido) sea único en la base de datos
    private String email;
    private String password;
}
