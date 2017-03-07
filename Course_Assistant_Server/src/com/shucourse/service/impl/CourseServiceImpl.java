/**
 * @Title: CourseServiceImpl.java
 * @Package: com.shucourse.service.impl
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午4:01:00
 * @version V1.0
 */
package com.shucourse.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.shucourse.dao.CourseDao;
import com.shucourse.entity.Course;
import com.shucourse.entity.Page;
import com.shucourse.service.CourseService;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午4:01:00
 */
public class CourseServiceImpl implements CourseService {
    private CourseDao courseDao;
    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public Course findCourse(Course course) {
        return courseDao.findCourse(course);
    }

    @Override
    public Page findCourseList(Integer currPage, Course course) {
        DetachedCriteria criteria = course2Criteria(course);
        
        //查找页数
        Page page = new Page();
        page.setCurrPage(currPage);
        // 每页30已设置，可以自行更改，此处不再设置
        // page.setPageSize(30);
        Integer totalCount = courseDao.countCourse(criteria);
        page.setTotalCount(totalCount);
        double tc = totalCount;
        Double totalPage = Math.ceil(tc / page.getPageSize());
        page.setTotalPage(totalPage.intValue());
        
        int begin = 0;
        if (currPage - 1 <= 0) {
            currPage = 0;
            page.setCurrPage(currPage);
        } else if (currPage >= totalPage.intValue()) {
            currPage = totalPage.intValue();
            page.setCurrPage(currPage);
        }
        begin = (currPage - 1) * page.getPageSize();
        List<Course> list = courseDao.findCourseByPage(criteria, begin, page.getPageSize());
        page.setList(list);
        return page;
    }

    public DetachedCriteria course2Criteria(Course course) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Course.class);
        if (course.getcId() != null && !"".equals(course.getcId())) {
            criteria = criteria.add(Restrictions.like("cId", "%" + course.getcId() + "%"));
        }
        if (course.getcName() != null && !"".equals(course.getcName())) {
            criteria = criteria.add(Restrictions.like("cName", "%" + course.getcName() + "%"));
            System.out.println("%" + course.getcName() + "%");
        }
        if (course.getcCredit() != null && !"".equals(course.getcCredit())) {
            criteria = criteria.add(Restrictions.eq("cCredit", course.getcCredit()));
        }
        if (course.gettId() != null && !"".equals(course.gettId())) {
            criteria = criteria.add(Restrictions.like("tId", "%" + course.gettId() + "%"));
            System.out.println("%" + course.gettId() + "%");
        }
        if (course.gettName() != null && !"".equals(course.gettName())) {
            criteria = criteria.add(Restrictions.like("tName", "%" + course.gettName() + "%"));
        }
        if (course.getcTime() != null && !"".equals(course.getcTime())) {
            criteria = criteria.add(Restrictions.like("cTime", "%" + course.getcTime() + "%"));
        }
        if (course.getcLocation() != null && !"".equals(course.getcLocation())) {
            criteria = criteria.add(Restrictions.like("cLocation", "%" + course.getcLocation() + "%"));
        }
        if (course.getcSize() != null && !"".equals(course.getcSize())) {
            criteria = criteria.add(Restrictions.sizeLe("cSize", course.getcSize()));
        }
        if (course.getcNumber() != null && !"".equals(course.getcNumber())) {
            criteria = criteria.add(Restrictions.sizeLe("cNumber", course.getcNumber()));
        }
        if (course.getcCampus() != null && !"".equals(course.getcCampus())) {
            criteria = criteria.add(Restrictions.like("cCampus", "%" + course.getcCampus() + "%"));
        }
        if (course.getcLimit() != null && !"".equals(course.getcLimit())) {
            criteria = criteria.add(Restrictions.like("cLimit", "%" + course.getcLimit() + "%"));
        }
        return criteria;
    }
}
