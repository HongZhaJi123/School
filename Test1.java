class Student{
	private String name;
	private int score;
	public Student() {
		
	}
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
		}
	public void report() {
		System.out.println(name+"��ο��Կ���"+score+"��");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student p1 = new Student("С��",59);
		Student p2 = new Student();
		p2.setName("С��");
		p2.setScore(99);
		p1.report();
		p2.report();
	}
}
