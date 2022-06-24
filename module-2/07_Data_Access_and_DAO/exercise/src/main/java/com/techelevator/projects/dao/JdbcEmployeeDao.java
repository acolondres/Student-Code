package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> employee = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employee.add(theEmployee);
		}
		return employee;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee " +
				"WHERE first_name ILIKE ? AND last_name ILIKE ?;";
		String firstNameWild = "%" + firstNameSearch + "%";
		String lastNameWild = "%" + lastNameSearch + "%";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, firstNameWild, lastNameWild);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));

		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		ArrayList<Employee> employee = new ArrayList<>();


		String sql = "SELECT * FROM project_employee " + "JOIN employee ON employee.employee_id = project_employee.employee_id " +
				"WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while(results.next()) {
			Employee wmployee = mapRowToEmployee(results);
			employee.add(wmployee);

		}
		return employee;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee(project_id, employee_id) VALUES(?, ?)";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
			String sql = "DELETE FROM project_employee WHERE project_employee.employee_id = ?; " + "DELETE FROM employee WHERE employee_id = ?";


			jdbcTemplate.update(sql, employeeId);

		}


	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> withoutProjects = new ArrayList<>();
		String sql = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				     "FROM employee " +
						"LEFT JOIN project_employee ON project_employee.employee_id = employee.employee_id " +
						"WHERE project_employee.project_id IS NULL;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			withoutProjects.add(mapRowToEmployee(results));
		}



		return withoutProjects;
	}


	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee theEmployee;
		theEmployee = new Employee();
		theEmployee.setId(results.getInt("employee_id"));
		theEmployee.setDepartmentId(results.getInt("department_id"));
		theEmployee.setFirstName(results.getString("first_name"));
		theEmployee.setLastName(results.getString("last_name"));
		theEmployee.setBirthDate(results.getDate("birth_date").toLocalDate());
		theEmployee.setHireDate(results.getDate("hire_date").toLocalDate());

		return theEmployee;
	}


}
