package ua.com.helper.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sun.istack.internal.Nullable;

import ua.com.helper.Utils.Constants;

@DiscriminatorValue("admin")
public class Admin extends Person{
	@Enumerated(EnumType.STRING)
	@Nullable
	private Constants.Role role;
}
