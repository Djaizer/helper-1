package ua.com.helper.DaoImpl;

import java.util.List;

import ua.com.helper.Dao.IAdminDao;
import ua.com.helper.Model.Admin;
import ua.com.helper.Utils.Constants.Role;

public class AdminDao implements IAdminDao {

	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdmin(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAdmins(boolean enabled, boolean deleted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAdmins(boolean enabled, boolean deleted, Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeAdmin(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeAdmins(List<Admin> admins) {
		// TODO Auto-generated method stub
		return 0;
	}

}
