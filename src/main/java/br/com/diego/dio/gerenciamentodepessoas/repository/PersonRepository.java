package br.com.diego.dio.gerenciamentodepessoas.repository;

import br.com.diego.dio.gerenciamentodepessoas.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
