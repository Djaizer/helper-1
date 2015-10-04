package ua.com.helper.Dao;

import java.util.List;

import ua.com.helper.Model.Admin;
import ua.com.helper.Utils.Constants;

public interface IAdminDao {
	public Admin createAdmin(Admin admin);

	public Admin saveAdmin(Admin admin);

	public Admin getAdmin(long id);

	public List<Admin> getAdmins(boolean enabled, boolean deleted);

	public List<Admin> getAdmins(boolean enabled, boolean deleted, Constants.Role role);

	public int removeAdmin(long id);

	public int removeAdmins(List<Admin> admins);
}
