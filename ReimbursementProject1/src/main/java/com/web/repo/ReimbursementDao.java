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

public class ReimbursementDao implements DaoContract<Reimbursement, Integer> {

	@Override
	public List<Reimbursement> findAll() {
		List<Reimbursement> reimbursement = new LinkedList<>();
		String sql = "select * from project1.ers_reimbursement";
		try (Connection conn = ConnectionUtil.getInstance().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				/*
				 * reimb_id serial primary key, reimb_amount integer, reimb_submitted timestamp
				 * default(now()), reimb_resolved timestamp default(now()), reimb_description
				 * text, reimb_receipt bytea, reimb_author integer references
				 * public.ers_users(ers_users_id), reimb_resolver integer references
				 * public.ers_users(ers_users_id), reimb_status_id integer references
				 * public.ers_reimbursement_status(reimb_status_id), reimb_type_id integer
				 * reimb_resolver integer reimb_status_id integer reimb_type_id integer
				 */

				reimbursement.add(new Reimbursement(rs.getInt("reimb_id"), rs.getDouble("reimb_amount"),
						
						rs.getTimestamp("reimb_submitted").toLocalDateTime(),
						
						rs.getTimestamp("reimb_resolved").toLocalDateTime(), rs.getString("reimb_description"),
						rs.getBytes("reimb_receipt"), rs.getInt("reimb_author"), rs.getInt("reimb_resolver"),
						rs.getInt("reimb_status_id"), rs.getInt("reimb_type_id")));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursement;
	}

	@Override
	public Reimbursement findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Reimbursement t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Reimbursement t) {
		
		return 0;
	}

	@Override
	public int delete(Reimbursement i) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * a.reimb_id, a.reimb_author, a.reimb_amount, b.reimb_status,
	 * a.reimb_submitted, c.reimb_type
	 */

	@Override
	public Reimbursement findByName(String name, String password) {
		return null;
	}

}
