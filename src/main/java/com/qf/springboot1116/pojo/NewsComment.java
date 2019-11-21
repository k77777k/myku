package com.qf.springboot1116.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class NewsComment {

  private Long id;
  private Long newsid;
  private String content;
  private String author;
  private Date createdate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getNewsid() {
    return newsid;
  }

  public void setNewsid(long newsid) {
    this.newsid = newsid;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public Date getCreatedate() {
    return createdate;
  }

  public void setCreatedate(java.sql.Timestamp createdate) {
    this.createdate = createdate;
  }

}
