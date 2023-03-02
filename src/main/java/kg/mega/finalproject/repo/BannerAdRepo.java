package kg.mega.finalproject.repo;

import kg.mega.finalproject.moldels.BannerAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerAdRepo extends JpaRepository<BannerAd, Long> {
}
