package com.ATD.demoRestex;

import java.sql.*;
import java.util.*;



public class ProjectDao {

	Connection con=null;

	public ProjectDao() {
		String url="jdbc:mysql://localhost:3306/student_project";
		String un="root";
		String pass="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,un,pass);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public List<Project> getAllProjects(){
	
		 List<Project> projects = new ArrayList<>();
		 String sql="select * from project";
		 
		 try {
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(sql);
			 while(rs.next())
			 {
				 Project pr = new Project();
				 pr.setPRJ_NO(rs.getString(1));
				 pr.setPRJ_NAME(rs.getString(2));
				 pr.setPRJ_DUR(rs.getInt(3));
				 pr.setPRJ_PLATFORM(rs.getString(4));
				 
				 projects.add(pr);
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return projects;
	}
	
	public List<Student> getAllStudent(){
		
		 List<Student> students = new ArrayList<>();
		 String sql="select * from student";
		 
		 try {
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(sql);
			 while(rs.next())
			 {
				 Student stu = new Student();
				 
				 stu.setSTUDENT_NO(rs.getString(1));
				 stu.setSTUDENT_NAME(rs.getString(2));;
				 stu.setSTUDENT_DOB(rs.getDate(3));
				 stu.setSTUDENT_DOJ(rs.getDate(4));
				 
				 students.add(stu);
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return students;
	}

	
	public Project getOneProjects(int id)
	{
		String sql="select * from project where PRJ_DUR="+id;
		 Project pr = new Project();
		 
		 try {
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(sql);
			 if(rs.next())
			 {
				 pr.setPRJ_NO(rs.getString(1));
				 pr.setPRJ_NAME(rs.getString(2));
				 pr.setPRJ_DUR(rs.getInt(3));
				 pr.setPRJ_PLATFORM(rs.getString(4));
			 }
			 }catch(Exception e)
		 		{
				 System.out.println(e);
		 		}
		return pr;
	}
	
	public Student getOneStudent(String no)
	{
		String sql="select * from student where STUDENT_NO="+no;
		 Student stu = new Student();
		 
		 try {
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(sql);
			 if(rs.next())
			 {
				 stu.setSTUDENT_NO(rs.getString(1));
				 stu.setSTUDENT_NAME(rs.getString(2));
				 stu.setSTUDENT_DOB(rs.getDate(3));
				 stu.setSTUDENT_DOJ(rs.getDate(4));
				 
			 }
			 }catch(Exception e)
		 		{
				 System.out.println(e);
		 		}
		return stu;
	}
	
	public void createproject(Project p)
	{
		String sql="insert into project values(?,?,?,?)";
		
		try {
			 PreparedStatement st = con.prepareStatement(sql);
			 
			 st.setString(1,p.getPRJ_NO());
			 st.setString(2,p.getPRJ_NAME());
			 st.setInt(3,p.getPRJ_DUR());
			 st.setString(4, p.getPRJ_PLATFORM());
			 
			 st.executeUpdate();
			 
			 }catch(Exception e)
		 		{
				 System.out.println(e);
		 		}
	}
	
	public void createStudent(Student s)
	{
		String sql="insert into student values(?,?,?,?)";
		
		try {
			 PreparedStatement st = con.prepareStatement(sql);
			 
			 st.setString(1,s.getSTUDENT_NO());
			 st.setString(2,s.getSTUDENT_NAME());
			 st.setDate(3, s.getSTUDENT_DOB());
			 st.setDate(4, s.getSTUDENT_DOJ());
			 
			 st.executeUpdate();
			 
			 }catch(Exception e)
		 		{
				 System.out.println(e);
		 		}
	}
	
	public void updateProject(Project p)
	{
		String sql="update project set PRJ_NAME = ? where PRJ_NO=?";
		
		try {
			 PreparedStatement st = con.prepareStatement(sql);
			 
			 st.setString(1,p.getPRJ_NAME());
			 st.setString(2,p.getPRJ_NO());
			 
			 st.executeUpdate();
			 
			 }catch(Exception e)
		 		{
				 System.out.println(e);
		 		}
	}
	
	public void updateStudent(Student s)
	{
		String sql="update student set STUDENT_NAME = ? where STUDENT_NO=?";
		
		try {
			 PreparedStatement st = con.prepareStatement(sql);
			 
			
			 st.setString(1,s.getSTUDENT_NAME());
			 st.setString(2,s.getSTUDENT_NO());
			 
			 st.executeUpdate();
			 
			 }catch(Exception e)
		 		{
				 System.out.println(e);
		 		}
	}
	
	public void deleteProject(int id) {
		String sql="delete from project where PRJ_DUR="+id;
		
		try {
			 PreparedStatement st = con.prepareStatement(sql);
			 st.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void deleteStudent(String id) {
		String sql="delete from student where STUDENT_NO="+id;
		
		try {
			 PreparedStatement st = con.prepareStatement(sql);
			 st.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
