package com.training.demo.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders", schema = "dbo")
public class Order  implements Serializable{



   /**
     *
     */
    private static final long serialVersionUID = 1L;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    
    
    @Column(name = "order_date")
    private LocalDate orderDate;
    
    @Column(name = "create_By")
    private String createBy;
    
    @Column(name = "quantity")
    private Integer quantity;
    
    
    @Column(name = "unit_Price")
    private Double unitPrice;
    
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;




    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
    }




    public LocalDate getOrderDate() {
        return orderDate;
    }




    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }




    public String getCreateBy() {
        return createBy;
    }




    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }




    public Integer getQuantity() {
        return quantity;
    }




    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }




    public Double getUnitPrice() {
        return unitPrice;
    }




    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }



//
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}




    
}
