package com.qf.springboot1116.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "news_detail")
public class NewsDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String summary;
  private String author;
  private Date createdate;

  @Transient
  private String ooo;



}
