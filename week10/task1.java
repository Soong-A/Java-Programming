package demo1.week10;

public class task1 {
    public static void main(String[] args) {
        // 定义一个二维数组
        int[][] array = {
                {},           // 第0行，空数组
                {},           // 第1行，空数组
                {1, 2, 3},    // 第2行
                {4, 5, 6, 7}, // 第3行
                {8, 9, 10},   // 第4行
                {11, 12, 13, 14, 15}, // 第5行
                // 注意：原示例中的第6行和第7行是重复的，这里为了演示做了修改
        };

        // 获取二维数组的行数
        int rowCount = array.length;
        System.out.println("row count: " + rowCount);

        // 获取某一行的长度（例如第2行）
        int secondRowLength = array[2].length;
        System.out.println("The second length: " + secondRowLength);

        // 计算二维数组的总长度
        int totalLength = 0;
        for (int i = 0; i < rowCount; i++) {
            totalLength += array[i].length;
        }
        System.out.println("the sum of length: " + totalLength);
        System.out.println("the length of array: " + array.length);
    }
}


