package one.dio.personalapi.repository;

import one.dio.personalapi.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}