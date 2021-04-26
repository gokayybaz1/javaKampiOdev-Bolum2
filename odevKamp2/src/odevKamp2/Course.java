package odevKamp2;

public class Course {
	
	public Course(int courseId,String courseName, String courseImage,String coursePriceInformation,String courseTeacher,String courseDetail) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseImage = courseImage;
		this.coursePriceInformation = coursePriceInformation;
		this.courseTeacher = courseTeacher;
	};
    int courseId;
	String courseName;
	String courseDetail;
	String courseTeacher;
	String courseImage;
	String coursePriceInformation;
}
