package com.example.domain.util.builder;

import com.example.domain.command.impl.entity.User;
import com.example.domain.command.impl.entity.UserStatus;

public interface UserBuilder {

    UserBuilder withLogin(String login);

    UserBuilder withPassword(String password);

    UserBuilder withName(String name);

    UserBuilder withSurname(String surname);

    UserBuilder withPhone(String phone);

    UserBuilder withUserStatus(UserStatus status);

    User build();
}
