package com.dnd.microdnd.web.controller;

import com.dnd.microdnd.model.Enemy;
import com.dnd.microdnd.web.EnemyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnemyController {

    EnemyRepository enemyRepository;

    @PostMapping("/enemies")
    public void saveEnemy(@RequestBody Enemy enemy) {
        enemyRepository.save(enemy);
    }

    @GetMapping("/enemies")
    public List<Enemy> enemyList() {
        return enemyRepository.findAll();
    }

    @DeleteMapping("/enemies/{id}")
    public void deleteEnemy(@PathVariable int id) {
        Optional<Enemy> enemyToDelete = enemyRepository.findById(id);
        if(enemyToDelete.isPresent()) {
            enemyRepository.deleteById(id);
        }
    }


}
