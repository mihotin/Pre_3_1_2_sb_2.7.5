package Pre_3_1_2_sd_275.service;
import Pre_3_1_2_sd_275.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public interface UserService {

    void save(User user);

    void delete(Long id);

    void update(Long id, User updateUser);

    User getOne(Long id);

    List<User> getAll();

    PasswordEncoder getPasswordEncoder();
}
