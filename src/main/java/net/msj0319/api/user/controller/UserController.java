package net.msj0319.api.user.controller;

import net.msj0319.api.user.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(User user) {

    }
    @PutMapping
    public void update(User user) {

    }

    @GetMapping("/exist/{id}")
    public boolean existById(long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @DeleteMapping
    public void deleteById(long id) {

    }

}