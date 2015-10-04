package ua.com.helper.Dao;

import java.util.List;

import ua.com.helper.Model.Volunteer;
import ua.com.helper.Utils.Constants;

public interface IVolunteerDao {
	public Volunteer createVolunteer(Volunteer Volunteer);

	public Volunteer saveVolunteer(Volunteer Volunteer);

	public Volunteer getVolunteer(long id);

	public List<Volunteer> getVolunteers(boolean enabled, boolean deleted);

	public List<Volunteer> getVolunteers(boolean enabled, boolean deleted, Constants.Role role);

	public int removeVolunteer(long id);

	public int removeVolunteers(List<Volunteer> Volunteers);
}
