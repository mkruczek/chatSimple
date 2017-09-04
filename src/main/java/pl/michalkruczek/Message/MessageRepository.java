package pl.michalkruczek.Message;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mikr on 04/09/17.
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
