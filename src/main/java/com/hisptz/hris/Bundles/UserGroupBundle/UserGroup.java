package com.hisptz.hris.Bundles.UserGroupBundle;


import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user_group")
@Data
public class UserGroup extends Model {
    @Basic
    @Column(name = "name")
    @Size(max = 64)
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "roles")
    private String roles;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "user_group_members",
            joinColumns = { @JoinColumn(name = "group_id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id")})
    private Set<User> user = new HashSet<User>();
}
