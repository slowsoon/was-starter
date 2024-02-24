package io.slowsoon.wasstarterserver.data.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "tb_menu")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "parent_id", nullable = true)
    private Long parent_id;

    @Column(name = "page_id", nullable = true)
    private Long page_id;

    @Column(name = "menu_order", nullable = true)
    private Long menu_order;

    @CreationTimestamp
    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Builder
    public Menu(String name, Long parent_id, Long page_id, Long menu_order) {
        this.name = name;
        this.parent_id = parent_id;
        this.page_id = page_id;
        this.menu_order = menu_order;
    }
}
