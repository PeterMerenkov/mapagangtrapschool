package ru.merenkoff.mapagangtrapschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.merenkoff.mapagangtrapschool.domain.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
}
