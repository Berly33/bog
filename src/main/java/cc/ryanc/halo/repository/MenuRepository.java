package cc.ryanc.halo.repository;

import cc.ryanc.halo.model.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 *     菜单持久层
 * </pre>
 *
 */
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
