package cafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cafe.beans.Beverage;

@Repository
public interface BeverageRepository extends

JpaRepository<Beverage, Long> { }
