package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

	@Autowired
	private JdbcTemplate jtemp;
	
	public int save(Student student)
	{
		String sql =" insert into student (id , name , address, course , dept) values(?, ?, ?, ?, ?)";
		return jtemp.update(sql , student.getId(), student.getName() , student.getAddress(), student.getCourse(), student.getDept());
	}
	
	public List<Student> findAll()
	{
		return jtemp.query("select * from student", (rs ,rowNum)-> new Student(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("course"), rs.getString("dept")));
	}
	
	public int update(Student student)
	{
		String sql =" update student set name=? , address=? , course=? , dept=? where id=?";
		return jtemp.update(sql ,student.getName() , student.getAddress(), student.getCourse(), student.getDept() , student.getId());
	}
	
	public int delete(int id)
	{
		String sql=" delete from student where id=?";
		return jtemp.update(sql , id);
	}
}
