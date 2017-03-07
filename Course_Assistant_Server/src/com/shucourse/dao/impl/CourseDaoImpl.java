/**
 * @Title: CourseDaoImpl.java
 * @Package: com.shucourse.dao.impl
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午1:38:36
 * @version V1.0
 */
package com.shucourse.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.shucourse.dao.CourseDao;
import com.shucourse.entity.Course;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午1:38:36
 */
public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

    @Override
    public Course findCourse(Course course) {
        return this.getHibernateTemplate().get(Course.class, course);
    }

    @Override
    public void saveCourse(Course course) {
        this.getHibernateTemplate().saveOrUpdate(course);
    }

    @Override
    public void updateCourse(Course course) {
        this.getHibernateTemplate().merge(course);
    }

    @Override
    public void deleteCourse(Course course) {
        this.getHibernateTemplate().delete(course);
    }

    @Override
    public Integer countCourse(DetachedCriteria criteria) {
        // select count(*) from Course ...
        @SuppressWarnings("unchecked")
        List<Course> list = (List<Course>) this.getHibernateTemplate()
                                .findByCriteria(criteria, 0, 0);
        if (list.size() > 0) {
            return list.size();
        }
        return 0;
    }

    @Override
    public List<Course> findCourseList(String hql, Object[] values) {
        @SuppressWarnings("unchecked")
        List<Course> list = (List<Course>) this.getHibernateTemplate().find(hql, values);
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    @Override
    public List<Course> findCourseByPage(DetachedCriteria criteria, Integer begin, Integer size) {
        @SuppressWarnings("unchecked")
        List<Course> list = (List<Course>) this.getHibernateTemplate().findByCriteria(criteria, begin, size);
        return list;
    }

}
