package pl.michalkruczek.Message;

import pl.michalkruczek.Message.enums.Colors;
import pl.michalkruczek.Message.enums.Styles;

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
    private Date postDate;
    @Column
    private String msg;
    @Column
    private Colors color;
    @Column
    private Styles style;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Styles getStyle() {
        return style;
    }

    public void setStyle(Styles style) {
        this.style = style;
    }
}
