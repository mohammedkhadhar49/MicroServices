package com.ratingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rating_service")
public class RatingModel {
	@Id
private String ratingId;
private Integer userId;
private String hotelId;
private Integer rating;
private String feedBack;
public String getRatingId() {
	return ratingId;
}
public void setRatingId(String ratingId) {
	this.ratingId = ratingId;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getHotelId() {
	return hotelId;
}
public void setHotelId(String hotelId) {
	this.hotelId = hotelId;
}
public Integer getRating() {
	return rating;
}
public void setRating(Integer rating) {
	this.rating = rating;
}
public String getFeedBack() {
	return feedBack;
}
public void setFeedBack(String feedBack) {
	this.feedBack = feedBack;
}

}
