package cc.ryanc.halo.repository;

import cc.ryanc.halo.model.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 *     友情链接持久层
 * </pre>
 *
 */
public interface LinkRepository extends JpaRepository<Link, Long> {
}
