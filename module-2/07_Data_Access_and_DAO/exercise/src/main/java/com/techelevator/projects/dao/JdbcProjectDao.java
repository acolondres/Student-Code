package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		return new Project(0, "Not Implemented Yet", null, null);
	}

	@Override
	public List<Project> getAllProjects() {
		return new ArrayList<>();
	}

	@Override
	public Project createProject(Project newProject) {

		 int id = newProject.getId();
		String sqlCreateProject = "INSERT into project " +
				"(project_id, name) VALUES (?, ?);";
		jdbcTemplate.update(sqlCreateProject, id, newProject.getName());

		Project theProject = new Project();
		theProject.setId(id);
		theProject.setName(newProject.getName());

		return theProject;
	}


	@Override
	public void deleteProject(int projectId) {

	}
	private Project mapRowToProject(SqlRowSet results) {
		Project project;
		project = new Project();
		project.setId(results.getInt("project_id"));
		project.setName(results.getString("name"));

		return project;
	}



}
