
package entities;
import java.io.Serializable;

/**
 *
 * @author Lenovo X1
 */
public class Salle implements Serializable{
    private int id;
    private String code;
    public Salle() {
    }

    public Salle(String code) {
        this.code = code;
    }


    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
  
}
