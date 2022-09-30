package com.dnd.microdnd.web;

import com.dnd.microdnd.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnemyRepository extends JpaRepository<Enemy, Integer> {


    List<Enemy> findByPlayerId(int playerId);
}
