package day18.Zuoye.Entity;

public class Classroom {
		private String classroom;
		private int id;
		private int number;
		public Classroom(String classroom, int number) {
			super();
			this.classroom = classroom;
			this.number = number;
		}
		public Classroom() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Classroom(int id,String classroom,  int number) {
			super();
			this.classroom = classroom;
			this.id = id;
			this.number = number;
		}
		@Override
		public String toString() {
			return "Classroom [classroom=" + classroom + ", id=" + id + ", number=" + number + "]";
		}
		public String getClassroom() {
			return classroom;
		}
		public void setClassroom(String classroom) {
			this.classroom = classroom;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
}
