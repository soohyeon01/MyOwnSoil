package springboot_developer.myownsoil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot_developer.myownsoil.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
