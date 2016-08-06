package entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Film {
    private short film_id;
    private String title;
    private String description;
    private Date release_year;
    private byte language_id;
    private byte original_language_id;
    private byte rental_duration;
    private BigDecimal rental_rate;
    private Integer length;
    private BigDecimal replacement_cost;
    private String language;
    
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public short getFilm_id() {
		return film_id;
	}
	public void setFilm_id(short film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getRelease_year() {
		return release_year;
	}
	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}
	public byte getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(byte language_id) {
		this.language_id = language_id;
	}
	public byte getOriginal_language_id() {
		return original_language_id;
	}
	public void setOriginal_language_id(byte original_language_id) {
		this.original_language_id = original_language_id;
	}
	public byte getRental_duration() {
		return rental_duration;
	}
	public void setRental_duration(byte rental_duration) {
		this.rental_duration = rental_duration;
	}
	public BigDecimal getRental_rate() {
		return rental_rate;
	}
	public void setRental_rate(BigDecimal rental_rate) {
		this.rental_rate = rental_rate;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public BigDecimal getReplacement_cost() {
		return replacement_cost;
	}
	public void setReplacement_cost(BigDecimal replacement_cost) {
		this.replacement_cost = replacement_cost;
	}
    
}
