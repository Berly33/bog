package cc.ryanc.halo.repository;

import cc.ryanc.halo.model.domain.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 *     图库持久层
 * </pre>
 *
 */
public interface GalleryRepository extends JpaRepository<Gallery, Long> {
}
