package com.web.study.controller;

import com.alibaba.fastjson.JSON;
import com.web.study.dao.CourseDao;
import com.web.study.entity.Course;
import com.web.study.entity.QueryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    CourseDao courseDao;

    @RequestMapping("/search")
    public String search(@RequestBody QueryInfo queryInfo) {
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<Course> courses = courseDao.selectCourseByCourseName("%" + queryInfo.getInfo() + "%",
                pageStart,
                queryInfo.getPageSize());
        HashMap<String, Object> response = new HashMap<>();
        response.put("courseList", courses);
        if (courses.size() == 0) {
            response.put("flag", "no");
        } else {
            response.put("flag", "ok");
        }

        return JSON.toJSONString(response);

    }
}
