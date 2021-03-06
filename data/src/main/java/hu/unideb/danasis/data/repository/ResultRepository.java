package hu.unideb.danasis.data.repository;

import hu.unideb.danasis.data.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long>{
}
