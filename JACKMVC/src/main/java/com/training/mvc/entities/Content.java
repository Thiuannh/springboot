package com.training.mvc.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Content",schema = "dbo")
public class Content {
	
	@Id
	@Column(name = "Id_conten")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInteger;
	
	private String title;
	
	private String brief;
	
	private String content;
	
	private LocalDateTime dateTime;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	

	public Content(String title, String brief, String content, LocalDateTime dateTime) {
		super();
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.dateTime = dateTime;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
