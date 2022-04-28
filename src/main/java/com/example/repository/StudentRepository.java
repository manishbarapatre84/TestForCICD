package com.example.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

	public List<Student> findByRollno(String rollno);
	
	public List<Student> getByName(String name);
	
	public List<Student> queryByName(String name);
	
	public List<Student> getByNameAndUniversity(String name,String university );
	
	public List<Student> findByAddressCityAndAddressHouseNumber(String city,String houseNumber);
	
	
	@Query("select s from Student s where s.name = ?1")
	List<Student> getStudents(String name);
	
	@Query(value = "select * from student s where s.name = ?1", nativeQuery = true)
	List<Student> findStudentsUsingNativeQuery(String name);
	
}
