package com.example.auth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Role {

    private Integer id;

    private RoleType type;

    public Role(RoleType type) {
        this.type = type;
    }
}
