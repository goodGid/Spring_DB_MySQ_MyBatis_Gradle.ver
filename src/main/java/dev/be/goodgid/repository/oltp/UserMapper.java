package dev.be.goodgid.repository.oltp;

import dev.be.goodgid.model.User;

public interface UserMapper {

    User selectByPrimaryKey(Long userSequence);
}
