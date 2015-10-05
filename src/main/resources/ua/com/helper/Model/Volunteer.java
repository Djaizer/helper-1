package ua.com.helper.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ua.com.helper.Utils.Constants;

@DiscriminatorValue("volunteer")
public class Volunteer extends Person {
	@Column(name = "role")
	private Constants.Role role;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id")
	private Team team;
}
