package cc.ryanc.halo.repository;

import cc.ryanc.halo.model.domain.Attachment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 *     附件持久层
 * </pre>
 *
 */
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

    /**
     * 查询所有附件，分页
     *
     * @param pageable pageable
     * @return Page
     */
    @Override
    Page<Attachment> findAll(Pageable pageable);
}
