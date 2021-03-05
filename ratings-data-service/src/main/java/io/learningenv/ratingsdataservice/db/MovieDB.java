package io.learningenv.ratingsdataservice.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="test")
@Data
public class MovieDB {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pkId;
	private String movieId;
	private String score;
}
