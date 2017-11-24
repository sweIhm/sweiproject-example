package base.activitymeter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;


@Entity
public class Activity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String text;
  private String title;
  // private String tags;
  private ArrayList<Tag> tags = new ArrayList<>();

  public Activity() {};

  public Activity(String text, ArrayList<Tag> tags, String title) {
    this.text = text;
    this.tags = tags;
    this.title = title;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void addTag(Tag tag) {
    tags.add(tag);
  }

  public ArrayList<Tag> getTags() {
    return tags;
  }

  public void setTags(ArrayList<Tag> tags) {
    this.tags = tags;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
