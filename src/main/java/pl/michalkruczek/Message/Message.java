package pl.michalkruczek.Message;



import javax.persistence.*;
import java.util.Date;

/**
 * Created by mikr on 04/09/17.
 */
@Entity
@Table(name = "msgs")
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String postDate;
    @Column
    private String msg;
    @Column
    private String color;
    @Column
    private String style;
    @Column
    private String nick;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
