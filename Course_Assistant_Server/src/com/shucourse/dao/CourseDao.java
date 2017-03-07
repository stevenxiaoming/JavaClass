/**
 * @Title: ClassDao.java
 * @Package: com.shuclass.dao
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午1:27:37
 * @version V1.0
 */
package com.shucourse.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.shucourse.entity.Course;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午1:27:37
 */
public interface CourseDao {
    /**
     * 基本怎删改查功能及分页功能
     */
    Course findCourse(Course course);
    void saveCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(Course course);
    
    /**
     * 统计符合要求的课程数量
     * 可设置多条件
     */
    Integer countCourse(DetachedCriteria criteria);
    /**
     * 按要求查询相关课程，支持模糊查询
     */
    List<Course> findCourseList(String hql, Object[] values);
    List<Course> findCourseByPage(DetachedCriteria criteria, Integer begin, Integer size);
}
