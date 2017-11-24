package base.activitymeter;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tag implements Serializable{
  private static final long serialVersionUID = 5136004429664744283L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;

  public Tag() {}

  public Tag(String name) {
    this.name = name;
  }

  public void setName(String in) {
    name = in;
  }

  public String getName() {
    return name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
