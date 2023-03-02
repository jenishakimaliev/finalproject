package kg.mega.finalproject.repo;

import kg.mega.finalproject.moldels.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
