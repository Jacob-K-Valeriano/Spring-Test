package com.jacob.val.repositories;

public interface Users extends JpaRepository<User, Long> {
    User findByUsername(String username);
}