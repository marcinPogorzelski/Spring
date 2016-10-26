package com.mp.sampledao;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {

	public void setDataSource(DataSource dataSource);
	public void create(String name, int age);
	public Student getStudent(int id);
	public List<Student> listStudents();
	public void deleteStudent(int id);
	public void updateStudent(int id, int age);
}
