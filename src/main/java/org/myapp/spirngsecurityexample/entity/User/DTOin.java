package org.myapp.spirngsecurityexample.entity.User;


import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DTOin {
    private String username;
    private String password;
}
