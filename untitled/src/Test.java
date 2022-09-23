import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); // int형 스택 선언
        stack.push(2); // 가장아래 추가
        stack.push(4); // 다음 추가
        stack.push(1); // 마지막 추가
        stack.pop(); // stack에 값제거 (상단 값부터) 제거하면 크기도 줄어듦
        // stack.clear(); // stack의 전체값 제거
        System.out.println(stack.peek()); // 가장 상단값
        System.out.println(stack.size()); // stack 크기 출력
        System.out.println(stack.empty()); // stack이 비어잇는지 check (비어잇으면 true)
        System.out.println(stack.contains(2)); // stack에 2가 들어있는지 (있으면 true)

    }
}
