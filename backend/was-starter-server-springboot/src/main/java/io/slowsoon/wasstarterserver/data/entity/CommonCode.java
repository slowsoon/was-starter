package io.slowsoon.wasstarterserver.data.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Table(name = "tb_common_code")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class CommonCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "code_value", nullable = false)
    private String code_value;

    @Column(name = "code_order", nullable = true)
    private Long code_order;

    @Column(name = "code_group_yn", nullable = true)
    private String code_group_yn;

    @Column(name = "parent_id", nullable = true)
    private Long parent_id;

    @CreationTimestamp
    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Builder
    public CommonCode(String name, String code_value, String code_group_yn, Long parent_id, Long code_order) {
        this.name = name;
        this.code_value = code_value;
        this.code_group_yn = code_group_yn;
        this.parent_id = parent_id;
        this.code_order = code_order;
    }
}
