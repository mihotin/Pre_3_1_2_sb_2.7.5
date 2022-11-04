package Pre_3_1_2_sd_275.service;

import Pre_3_1_2_sd_275.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAll();

    void save(Role role);
}
