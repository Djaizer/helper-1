package ua.com.helper.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Person extends BaseObject {

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "settlement_id")
	private Settlement settlement;
}
