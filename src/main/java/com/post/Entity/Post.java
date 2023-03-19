package com.post.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Post  {
  @Id
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
  private String id;
  private String title;
  private String body;
  private LocalDateTime createDate = LocalDateTime.now();
  @UpdateTimestamp
  private LocalDateTime updateDate;

  public Post() {
  }
  public Post(String title, String body) {
    this.title = title;
    this.body = body;
  }

  public Post(String id, String title, String body, LocalDateTime createDate, LocalDateTime updateDate) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.createDate = createDate;
    this.updateDate = updateDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public LocalDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }

  public LocalDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDateTime updateDate) {
    this.updateDate = updateDate;
  }
}
