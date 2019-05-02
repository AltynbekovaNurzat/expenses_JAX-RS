package kg.itacademy.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="resp")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Category.class, User.class, Wallet.class, Expense.class, ArrayList.class})

/*public class Response {
    private String status;
    private String message;
    private List<User> arr;

    public Response() {
    }

    public Response(String status, String message, List<User> arr) {
        this.status = status;
        this.message = message;
        this.arr = arr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<User> getJson() {
        return arr;
    }

    public void setJson(Object json) {
        this.arr = arr;
    }
}*/

public class Response {
    private String status;
    private String message;
    private Object json;
    private List<User> arraryList;

    public Response() {
    }

    public Response(String status, List<User> arraryList) {
        this.status = status;
        this.arraryList = arraryList;
    }

    public Response(String status, String message, Object json) {
        this.status = status;
        this.message = message;
        this.json = json;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getJson() {
        return json;
    }

    public void setJson(Object json) {
        this.json = json;
    }

    public List<User> getArraryList() {
        return arraryList;
    }

    public void setArraryList(List<User> arraryList) {
        this.arraryList = arraryList;
    }
}