package odevKamp2;

public class Main {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavBarButton navBarButton1 = new NavBarButton(0,"S�k Kullan�lanlar");
		NavBarButton navBarButton2 = new NavBarButton(1,"Kampa Haz�rl�k");
		NavBarButton navBarButton3 = new NavBarButton(2,"T�m Kurslar");
		NavBarButton navBarButton4 = new NavBarButton(3,"Kurslar�m");
		
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
		
		Course course1 = new Course(0,"Yaz�l�m Geli�tirici Kamp� (C# + Angular)","2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n�...","Engin Demiro�","img1","�cretsiz");
		Course course2 = new Course(1,"Yaz�l�m Geli�tirici Kamp� (JAVA + REACT)","2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n�...","Engin Demiro�","img2","�cretsiz");
		Course course3 = new Course(2,"Programlamaya Giri� i�in Temel Kurs","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel progrmalama mant��� anla��l�r...","Engin Demiro�","img3","�cretsiz");
		
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
		
		Course course4 = new Course(3,"�rnek Kurs","�rnek A��klama","Engin Demiro�","�rnek Resim","�CRETS�Z");
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course4);

	}

}
