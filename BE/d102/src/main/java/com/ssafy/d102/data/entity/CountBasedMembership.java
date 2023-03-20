package com.ssafy.d102.data.entity;
import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "count_based_membership")
public class CountBasedMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_2_no")
    private Long type2No;

    @Column(name = "count", nullable = false)
    private Integer count;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "membership_no", nullable = false)
    private Membership membership;

    // getters and setters
}