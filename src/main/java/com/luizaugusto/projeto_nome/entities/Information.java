package com.luizaugusto.projeto_nome.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "tb_information")
@NoArgsConstructor
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @EqualsAndHashCode.Exclude
    public String name;
    @EqualsAndHashCode.Exclude
    public Integer age;
    @EqualsAndHashCode.Exclude
    @OneToOne(mappedBy = "information")
    @JsonIgnore
    public User user;

    public Information(Long id, String name, Integer age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
