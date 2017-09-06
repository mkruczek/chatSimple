package pl.michalkruczek.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("delete/{id}")
    public void deleteMsg(@PathVariable Long id){
        messageRepository.delete(id);
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public void cleanChat(){
        messageRepository.deleteAll();
    }
}
