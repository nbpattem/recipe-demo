package guru.springframework.model;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Category {
	private Long id;
	private String description;
	private Set<Recipe> recipes;

}
