package ru.vlapin.demo.andreydemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.demo.andreydemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
