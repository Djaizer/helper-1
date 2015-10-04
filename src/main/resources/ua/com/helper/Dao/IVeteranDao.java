package ua.com.helper.Dao;

import java.util.List;

import ua.com.helper.Model.Veteran;
import ua.com.helper.Utils.Constants;

public interface IVeteranDao {
	public Veteran createVeteran(Veteran Veteran);

	public Veteran saveVeteran(Veteran Veteran);

	public Veteran getVeteran(long id);

	public List<Veteran> getVeterans(boolean enabled, boolean deleted);

	public List<Veteran> getVeterans(boolean enabled, boolean deleted, Constants.Role role);

	public int removeVeteran(long id);

	public int removeVeterans(List<Veteran> Veterans);
}
