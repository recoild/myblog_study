package com.demo.myblog.user.repository;

import com.demo.myblog.config.CustomDataJpaTest;
import com.demo.myblog.domain.user.QUser;
import com.demo.myblog.domain.user.User;
import com.demo.myblog.domain.user.UserRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@CustomDataJpaTest
public class UserRepositoryTest {
    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {

        QUser user = QUser.user;

        User user1= jpaQueryFactory.selectFrom(user)
                .where(user.username.eq("1"))
                .fetchOne();

    }
}
