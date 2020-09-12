import java.util.ArrayList;

public class Points {
	private ArrayList<Integer> points;
	private ArrayList<Integer> passingPoints;

	public Points() {
		this.points = new ArrayList<>();
		this.passingPoints = new ArrayList<>();
	}

	public void add(int number) {
		if (number >= 0 && number <= 100) {
			this.points.add(number);
		}

		if (number >= 50 && number <= 100) {
			this.passingPoints.add(number);
		}
 	}

	public double average() {
		int total = 0;
		for (int point : this.points) {
			total += point;
		}

		return (double) total / this.points.size();
	}

	public double passingAverage() {
		int total = 0;
		for (int point : this.passingPoints) {
			total += point;
		}

		if (total == 0) {
			return 0.0;
		}

		return (double) total / this.passingPoints.size();
	}

	public double passPercentage() {
		return ((double) this.passingPoints.size() / this.points.size()) * 100 ;
	}

	public int gradeCount(int lower, int upper) {
		int count = 0;
		for (int grade : points) {
			if (grade >= lower && grade < upper) {
				count++;
			}
		}

		return count;
	}

	public void gradeDistribution() {
		int start = 5;
		while (start >= 0) {
			if (start == 5) {
				int count = this.gradeCount(90, 101);
				System.out.print(start + ": ");
				this.printGradeDistribution(count);
			} else if (start == 4) {
				int count = this.gradeCount(80, 90);
				System.out.print(start + ": ");
				this.printGradeDistribution(count);
			} else if (start == 3) {
				int count = this.gradeCount(70, 80);
				System.out.print(start + ": ");
				this.printGradeDistribution(count);
			} else if (start == 2) {
				int count = this.gradeCount(60, 70);
				System.out.print(start + ": ");
				this.printGradeDistribution(count);
			} else if (start == 1) {
				int count = this.gradeCount(50, 60);
				System.out.print(start + ": ");
				this.printGradeDistribution(count);
			} else {
				int count = this.gradeCount(0, 50);
				System.out.print(start + ": ");
				this.printGradeDistribution(count);
			}
			start -= 1;
			System.out.println("");
		}
	}

	public void printGradeDistribution(int repeat) {
		for (int i=0; i<repeat; i++) {
			System.out.print("*");
		}
	}
}
