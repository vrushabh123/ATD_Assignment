package com.ATD.demoRestex;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import javax.ws.rs.POST;
import javax.ws.rs.PUT;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	ProjectDao pd = new ProjectDao();
    @GET
    @Path("project")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public List<Project> getProject()
    {
    	System.out.println(pd.getAllProjects());
    	return pd.getAllProjects(); 	
    }
    
    @GET
    @Path("student")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public List<Student> getStudent()
    {
    	System.out.println(pd.getAllStudent());
    	return pd.getAllStudent(); 	
    }
    
    @GET
    @Path("resourceproject/{id}")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public Project getOne(@PathParam("id") int id)
    {
    	System.out.println("inside of single value return");
    	return pd.getOneProjects(id);
    }
    
    @GET
    @Path("resourcestudent/{id}")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public Student getOneStudent(@PathParam("id") String id)
    {
    	System.out.println("inside of single value return");
    	return pd.getOneStudent(id);
    }
    
    @POST
    @Path("createproject")
    public Project create(Project p1)
    {
    	
    	System.out.println("inside a create Project");
    	pd.createproject(p1);
    	System.out.println(p1);
    	return p1;
    }
    
    @POST
    @Path("createstudent")
    public Student create(Student p1)
    {
    	
    	System.out.println("inside a create Student");
    	pd.createStudent(p1);
    	System.out.println(p1);
    	return p1;
    }
    
    @PUT
    @Path("updateproject")
    public Project updateproject(Project p1)
    {
    	
    	System.out.println("inside a update" + p1);
    	if(pd.getOneProjects(p1.getPRJ_DUR()).getPRJ_DUR()==0)
    	{
    		System.out.println("data not found");
    	}
    	else {
    	pd.updateProject(p1);
            }
    	return p1;
    }
    
    @PUT
    @Path("updatestudent")
    public Student updatestudent(Student s1)
    {
    	
    	System.out.println("inside a Student update" + s1);
    	
    	if(pd.getOneStudent(s1.getSTUDENT_NO()).getSTUDENT_NO()==null)
    	{
    		System.out.println("data not found");
    	}
    	else {
    	pd.updateStudent(s1);
            }
    	return s1;
    }
    
    @DELETE
    @Path("deleteproject/{id}")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public Project deleteProject(@PathParam("id") int id)
    {
    	System.out.println("inside to delete the data of Project");
    	Project d = pd.getOneProjects(id);
    	if(d.getPRJ_DUR()!=0)
    		pd.deleteProject(id);
    	return d;
    }
    
    @DELETE
    @Path("deletestudent/{id}")
    @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
    public Student deleteStudent(@PathParam("id") String id)
    {
    	System.out.println("inside to delete the data of Student");
    	Student d = pd.getOneStudent(id);
    	if(d.getSTUDENT_NO()!=null)
    		pd.deleteStudent(id);
    	return d;
    }
}
