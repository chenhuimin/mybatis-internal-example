package org.mybatis.internal.example.mapper;

import org.mybatis.internal.example.pojo.User;

/**
 * Created by selina on 2018/4/3.
 */
public interface UserMapper {
    User getUser(int lfPartyId);
}
