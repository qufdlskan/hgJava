package ifExample;

public class IfTest01 {

	public static void main(String[] args) {
		int score = 89;
		
		if (score >=90) {
			System.out.println("점수가 100~90점입니다");
			System.out.println("등급은 A입니다");
		} else if(score >=80) {
			System.out.println("점수가 80~89점입니다");
			System.out.println("등급은 B입니다");
		}else if(score >=70) {
			System.out.println("점수가 70~79점입니다");
			System.out.println("등급은 C입니다");
		}else if(score >=60) {
			System.out.println("점수가 60~69점입니다");
			System.out.println("등급은 D입니다");
		}else {
			System.out.println("점수가 59점이하입니다");
			System.out.println("등급은 F입니다");
		}

	}

}
