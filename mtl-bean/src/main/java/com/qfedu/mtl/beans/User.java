package com.qfedu.mtl.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private String salt;
}
