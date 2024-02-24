package io.slowsoon.wasstarterserver.data.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "tb_property")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "prop_value", nullable = false)
    private String prop_value;

    @Column(name = "prop_order", nullable = true)
    private Long prop_order;

    @CreationTimestamp
    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Builder
    public Property(String name, String prop_value, Long prop_order) {
        this.name = name;
        this.prop_value = prop_value;
        this.prop_order = prop_order;
    }
}
