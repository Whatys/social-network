package org.socialnetwork.models;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id" , nullable = false)
    private long userId;
    @Column(name = "first_name" , nullable = false)
    private String firstName;
    @Column(name = "last_name" , nullable = false)
    private String lastName;
    @Column(name = "username" , nullable = false)
    private String userName;
    @Column(name = "email" , nullable = false)
    private String email;
    @Column(name = "birthday" , nullable = false)
    private LocalDate birthday;
    @Column(name = "password" , nullable = false)
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$", message = "not correct password")
    private String password;
    @Column(name = "password_confirmation" , nullable = false)
    private String passwordConfirmation;

    private Role role;

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", password='" + password + '\'' +
                ", confirmationPassword='" + passwordConfirmation+ '\'' +
                '}';
    }



}
