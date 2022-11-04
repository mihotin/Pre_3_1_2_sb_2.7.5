package Pre_3_1_2_sd_275.service;

import Pre_3_1_2_sd_275.model.Role;
import Pre_3_1_2_sd_275.repositorys.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class RoleServiceImp implements RoleService{
    private final RoleRepo roleRepo;

    @Autowired
    public RoleServiceImp(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    public List<Role> getAll() {
        return roleRepo.findAll();
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleRepo.save(role);
    }
}
