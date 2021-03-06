package cn.mengcms.infrastructure.mybatis;

import cn.mengcms.domain.user.User;
import cn.mengcms.domain.user.UserRepository;
import cn.mengcms.infrastructure.AbstractRepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

/**
 * @author zp
 */
public class UserRepositoryMyBatisTest extends AbstractRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void findByGuid() {
        User user = userRepository.findByGuid("oood");
        assertNull(user);

        user = new User("user", "123", "123", "ewo@honyee.cc");
        userRepository.saveUser(user);

        user = userRepository.findByGuid(user.guid());
        assertNotNull(user);
        assertNotNull(user.email());


    }


    @Test
    public void updateUser() {
        User user = new User("user", "123", "123", "ewo@honyee.cc");
        userRepository.saveUser(user);

        user = userRepository.findByGuid(user.guid());
        assertNotNull(user);
        assertNotNull(user.email());

        String newEmail = "test@honyee.cc";
        user.email(newEmail).phone("12344444");
        userRepository.updateUser(user);

        user = userRepository.findByGuid(user.guid());
        assertNotNull(user);
        assertEquals(user.email(), newEmail);
    }


    @Test
    public void findByUsername() {
        String username = "user";
        User user = new User(username, "123", "123", "ewo@honyee.cc");
        userRepository.saveUser(user);

        User result = userRepository.findByUsername(username);
        assertNotNull(result);
    }


}