package nl.hanze.application.entities;

import javax.persistence.*;


@Entity
@Table(name = "program")
public class Program {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "programname")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "user_role_id")
	private Integer roleId;


	public String getProgramName() {
		return programname;
	}

	public void setProgramName(String programname) {
		this.programname = programname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}