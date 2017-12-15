package demo.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.entities.emp;

public interface repo extends CrudRepository<emp, Long> {

}
