package by.academy.springtest.model.dao;

import by.academy.springtest.model.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportDao extends JpaRepository<Transport, Integer> {
}
