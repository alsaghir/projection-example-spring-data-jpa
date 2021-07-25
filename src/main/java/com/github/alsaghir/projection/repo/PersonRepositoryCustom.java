package com.github.alsaghir.projection.repo;

import com.github.alsaghir.projection.entity.LastNameOnly;

import java.util.List;

public interface PersonRepositoryCustom {

    List<LastNameOnly> findCustom();
}
