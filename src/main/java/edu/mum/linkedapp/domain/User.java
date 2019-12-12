package edu.mum.linkedapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
//@SecondaryTable(name = "profile", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_id"))
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "NotEmpty")
    @Column(name = "username", unique = true)
    private String username;

    private String password;

//    @Column(table = "profile")
    private String firstname;

//    @Column(table = "profile")
    private String lastname;

//    @Column(table = "profile")
    private String Email;

//    @Column(table = "profile")
    private String dob;

    @Transient
    private String confirm_password;
}
