package base.activitymeter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Activity.
 * Model class persisted using JPA
 * 
 * @author Gudrun Socher
 * @version 1.0
 *
 */

@Entity
public class Activity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String text;
  private String tags;
  private String title;

  public Activity() {}

  /**
   * Constructor used to initialize Activity object based on HTTP POST.
   * 
   * @param text Text of an Activity.
   * @param tags Tags of an Activity as a list of strings.
   * @param title Title of an Activity.
   */
  public Activity(String text, String tags, String title) {
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

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
