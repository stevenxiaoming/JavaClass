/**
 * @Title: CourseAction.java
 * @Package: com.shucourse.action
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午9:45:07
 * @version V1.0
 */
package com.shucourse.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shucourse.entity.Course;
import com.shucourse.service.CourseService;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午9:45:07
 */
public class CourseAction extends ActionSupport implements ModelDriven<Course> {
    private static final long serialVersionUID = 1L;
    private Course course;
    private CourseService courseService;
    private Integer page = 1;
    private Map<String, Object> jdata = new HashMap<String, Object>();
    private Map<String, Object> jfail = new HashMap<String, Object>();
    @Override
    public Course getModel() {
        if (course == null) {
            course = new Course();
        }
        return course;
    }
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
    public Map<String, Object> getJdata() {
        return jdata;
    }
    public void setJdata(Map<String, Object> jdata) {
        this.jdata = jdata;
    }
    public Map<String, Object> getJfail() {
        return jfail;
    }
    public void setJfail(Map<String, Object> jfail) {
        this.jfail = jfail;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public String info() {
        if (course.getcId() == null || "".equals(course.getcId()) 
                || course.gettId() == null || "".equals(course.gettId())) {
            jfail.put("success", 0);
            jfail.put("message", "课程号和教师号不能为空");
            return "jFail";
        } else if (course.getcId().length() != 8) {
            jfail.put("success", 0);
            jfail.put("message", "课程号必须为8位");
            return "jFail";
        } else if (course.gettId().length() != 4 || !course.gettId().matches("[0-9]+")) {
            jfail.put("success", 0);
            jfail.put("message", "教师号必须为4位数字");
            return "jFail";
        }
        jdata.put("success", 1);
        jdata.put("course", courseService.findCourse(course));
        return "jSuccess";
    }

    public String list() {
        if (course.hashCode() == new Course().hashCode()) {
            jfail.put("success", 0);
            jfail.put("message", "至少需要一项目数据");
            return "jFail";
        }
        jdata.put("success", 1);
        if (page == null || "0".equals(page)) {
            page = 1;
        }
        jdata.put("course", courseService.findCourseList(page, course));
        return "jSuccess";
    }
}
