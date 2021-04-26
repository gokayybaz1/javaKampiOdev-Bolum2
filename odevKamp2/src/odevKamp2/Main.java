package odevKamp2;

public class Main {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavBarButton navBarButton1 = new NavBarButton(0,"Sýk Kullanýlanlar");
		NavBarButton navBarButton2 = new NavBarButton(1,"Kampa Hazýrlýk");
		NavBarButton navBarButton3 = new NavBarButton(2,"Tüm Kurslar");
		NavBarButton navBarButton4 = new NavBarButton(3,"Kurslarým");
		
		NavBarButton[] navBarButtons = {
			navBarButton1,
			navBarButton2,
			navBarButton3,
			navBarButton4
		};
		
		System.out.println("Navbar Buttons");
		System.out.println("-----------------------");
		
		for (NavBarButton navBarButton : navBarButtons) {
			
			System.out.println(navBarButton.buttonTitle);
			System.out.println("-------");
		};
		
		System.out.println("-----------------------");
		
		Course course1 = new Course(0,"Yazýlým Geliþtirici Kampý (C# + Angular)","2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný...","Engin Demiroð","img1","Ücretsiz");
		Course course2 = new Course(1,"Yazýlým Geliþtirici Kampý (JAVA + REACT)","2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný...","Engin Demiroð","img2","Ücretsiz");
		Course course3 = new Course(2,"Programlamaya Giriþ için Temel Kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel progrmalama mantýðý anlaþýlýr...","Engin Demiroð","img3","Ücretsiz");
		
		Course[] courseList = {
			course1,
			course2,
			course3,
		};
		System.out.println("-----------------------");

		System.out.println("Kurslar");
		System.out.println("-----------------------");
		for (Course course : courseList) {
			System.out.println(course.courseName);
			System.out.println("------------");
		}
		System.out.println("-----------------------");
		
		Course course4 = new Course(3,"Örnek Kurs","Örnek Açýklama","Engin Demiroð","Örnek Resim","ÜCRETSÝZ");
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course4);

	}

}
