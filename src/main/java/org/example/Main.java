package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

  /**
   * ①学生名リストから3文字以上の学生名だけを表示する
   * <p>
   * ②学生名リストから偶数番号の削除した生徒以外を表示する
   *
   * @param args
   */
  public static void main(String[] args) {
    // ①学生名リストから3文字以上の学生名だけを表示する
    List<String> studentsList = List.of("武田", "長曾我部", "三好", "半兵衛", "金田", "James",
        "Alice");

    for (String studentName : studentsList) {
      if (studentName.length() >= 3) {
        System.out.println(studentName);
      }
    }

    // ②学生名リストから偶数番号の削除生徒以外を削除する
    Map<Integer, List<String>> studentsMap = new HashMap<>();

    studentsMap.put(1, List.of("織田"));
    studentsMap.put(2, List.of("豊臣"));
    studentsMap.put(3, List.of("徳川"));
    studentsMap.put(4, List.of("毛利"));
    studentsMap.put(5, List.of("島津"));
    studentsMap.put(6, List.of("Jones"));
    studentsMap.put(7, List.of("Alicia"));
    studentsMap.put(8, List.of("Pan"));
    studentsMap.put(9, List.of("Tranp"));
    studentsMap.put(10, List.of("Suzuki"));

    Iterator<Map.Entry<Integer, List<String>>> iterator = studentsMap.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<Integer, List<String>> entry = iterator.next();
      if (entry.getKey() % 2 == 0) {
        iterator.remove();
      }
    }

    System.out.println("削除した偶数以外の生徒" + studentsMap);

  }


}


