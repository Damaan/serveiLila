package com.esliceu.parser.repository;

import com.esliceu.parser.model.database.Group;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepository extends CrudRepository<Group, Integer> {

}