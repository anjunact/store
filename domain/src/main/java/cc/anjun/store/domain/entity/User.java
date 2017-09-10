package cc.anjun.store.domain.entity;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String username;
    private String password;
    private String address;
    private String tel;
    private int deleted;
}
