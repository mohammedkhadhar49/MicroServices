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
}
