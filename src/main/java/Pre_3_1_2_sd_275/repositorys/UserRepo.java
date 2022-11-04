package Pre_3_1_2_sd_275.repositorys;

import Pre_3_1_2_sd_275.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByFirstName(String username);
}
