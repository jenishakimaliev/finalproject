package kg.mega.finalproject.repo;

import kg.mega.finalproject.moldels.TextAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface TextAdRepo extends JpaRepository<TextAd, Long> {
}
