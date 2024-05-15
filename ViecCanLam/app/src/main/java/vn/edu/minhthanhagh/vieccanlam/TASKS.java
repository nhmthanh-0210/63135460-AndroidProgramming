package vn.edu.minhthanhagh.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {

    String name, message, date,  property;

    public TASKS(String name, String message, String date, String property) {
        this.name = name;
        this.message = message;
        this.date = date;
        this.property = property;
    }
    //tạo hàm khởi taọ không thuộc tính Select none


    public TASKS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    //tạo một hàm để phù  hợp  với đối tượng của FireBase để gọi tới
    //tạo đưa cho nó 1 key Value để  tương ứng với thằng Firebase


    public HashMap<String, String> toFireBaseObject(){
        HashMap<String, String>  taskObject = new HashMap<String, String>();
        taskObject.put("name", name);
        taskObject.put("message", message);
        taskObject.put("date", date);
        taskObject.put("property", property);

        return taskObject;
    }

}
