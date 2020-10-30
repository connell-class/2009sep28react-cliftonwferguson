package com.web.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import com.revature.config.ConnectionUtil;
import com.web.model.Reimbursement;
import com.web.model.ReimbursementType;
import com.web.model.User;

public class UserDao implements DaoContract<User, Integer> {

	@Override
	public List<User> findAll() {

		return null;
	}

	@Override
	public User findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User findByName(String name, String password) {
		User u = new User();

		String sql = "select * from project1.ers_users where ers_username=? and ers_password=?";
		try (Connection conn = ConnectionUtil.getInstance().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				u = new User(rs.getInt("ers_users_id"), rs.getString("ers_username"), rs.getString("ers_password"),
						rs.getString("user_first_name"), rs.getString("user_last_name"), rs.getString("user_email"),
						rs.getInt("user_role_id"));

			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(u);
		return u;
	}

	public static void main(String[] args) {
		UserDao ud = new UserDao();
		System.out.println(ud.findByName("", ""));

	}

}
