package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
@NamedNativeQuery(name = "getByPhone", query = "SELECT * FROM clients WHERE phone = :phone", resultClass = Clients.class)
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private int phone;
    private String about;
}
