package demo1.week10;

public class task9 {
    public static void main(String[] args) {

// Student's answers to the questions
        char[][] answers = {
                {'А', 'В', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'В', 'A', 'В', 'C', 'А', 'E', 'E', 'А', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'В', 'E', 'E', 'A', 'D'},
                {'C', 'В', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'А', 'В', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'В', 'В', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'В', 'В', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'В', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
// Keys to the
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (int i = 0; i < answers.length; i++) {
// Grade one student
            int correctAnswers = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctAnswers++;
            }
            System.out.println("Student" + i + "'s correct count is" + correctAnswers);

        }
    }
}
