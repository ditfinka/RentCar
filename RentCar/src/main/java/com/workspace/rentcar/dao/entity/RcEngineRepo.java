package com.workspace.rentcar.dao.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RcEngineRepo extends CrudRepository <RcEngine, Long>{ }
