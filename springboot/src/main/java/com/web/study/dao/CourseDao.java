package com.web.study.dao;

import com.web.study.entity.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {
    List<Course> selectCourseByCourseName(@Param("courseName") String courseName,
                                          @Param("pageStart") int pageStart,
                                          @Param("pageSize") int pageSize);

}
