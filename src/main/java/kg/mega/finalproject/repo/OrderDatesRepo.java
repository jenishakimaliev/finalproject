package kg.mega.finalproject.repo;

import kg.mega.finalproject.moldels.OrderDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDatesRepo extends JpaRepository<OrderDates, Long> {
}
