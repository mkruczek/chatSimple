package pl.michalkruczek.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mikr on 04/09/17.
 */
@RestController
@RequestMapping("msg/")
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public void postMsg(@RequestBody Message msg){

        messageRepository.save(msg);
    }

    @RequestMapping("all")
    public List<Message> allMsg(){
        return messageRepository.findAll();
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public void cleanChat(){
        messageRepository.deleteAll();
    }
}
