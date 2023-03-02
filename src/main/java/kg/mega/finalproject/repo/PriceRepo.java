package kg.mega.finalproject.repo;

import kg.mega.finalproject.moldels.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Price, Long> {

}
