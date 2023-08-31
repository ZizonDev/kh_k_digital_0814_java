package treeSet기본;
// TreeSet : 이진 검색 트리로 검색 기능을 강화시킨 자료구조. (Set이라서 중복값은 제외한다.)
// 데이터가 저장될 때 검색 트리 형태로 저장되고(정렬해 줄 필요 X), Inorder(Left-Root-Right) 방식으로 검색함.
// 참고로 Inorder, Preorder, Postorder 방식은 Root가 중간, 앞, 뒤에 위치하느냐 기준이다.

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for(Integer e : ts) System.out.print(e + " "); // 이진 검색 트리 형태로 데이터가 입력되면 Inorder 방식으로 정렬함.
    }
}
