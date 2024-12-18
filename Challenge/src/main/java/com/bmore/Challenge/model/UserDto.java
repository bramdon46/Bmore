package com.bmore.Challenge.model;

import com.bmore.Challenge.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    Long id;
    String userName;
    String password;

    public static UserDto mapToUserDto(User user){
        return UserDto.builder()
                .id(user.getUserId())
                .userName(user.getName())
                .password(user.getPassword())
                .build();
    }
}
