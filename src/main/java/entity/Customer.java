package entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Customer {
    private int customer_id;
    private byte store_id;
    private String first_name;
    private String last_name;
    private String email;
    private short address_id;
    private byte active;
    private Date create_date;
    private Timestamp last_update;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public byte getStore_id() {
		return store_id;
	}
	public void setStore_id(byte store_id) {
		this.store_id = store_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public short getAddress_id() {
		return address_id;
	}
	public void setAddress_id(short address_id) {
		this.address_id = address_id;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Timestamp getLast_update() {
		return last_update;
	}
	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}
    
}
