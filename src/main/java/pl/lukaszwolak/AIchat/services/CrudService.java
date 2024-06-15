package pl.lukaszwolak.AIchat.services;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public abstract class CrudService<TRepository extends JpaRepository<TEntity, Long>, TEntity> {

    @Autowired
    protected TRepository serviceRepository;

    public List<TEntity> getAll() {
        return serviceRepository.findAll();
    }
}
