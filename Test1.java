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
		System.out.println(name+"这次考试考了"+score+"分");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student p1 = new Student("小明",59);
		Student p2 = new Student();
		p2.setName("小花");
		p2.setScore(99);
		p1.report();
		p2.report();
	}
}
