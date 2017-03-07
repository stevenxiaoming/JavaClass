/**
 * @Title: CourseService.java
 * @Package: com.shucourse.service
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午3:57:20
 * @version V1.0
 */
package com.shucourse.service;

import com.shucourse.entity.Course;
import com.shucourse.entity.Page;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午3:57:20
 */
public interface CourseService {
    
    /**
     * 返回单个课程的详细信息[即List的一种特例]
     * @param cId
     * @param tId
     */
    Course findCourse(Course course);

    /**
     * 查找页数和记录条数等相关信息，并按页返回
     */
    Page findCourseList(Integer currPage, Course course);
    
}
