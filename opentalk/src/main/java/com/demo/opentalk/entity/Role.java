package com.demo.opentalk.entity;

import com.demo.opentalk.config.ERole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_NO")
    private int roleNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_NAME")
    private ERole roleName;

}
