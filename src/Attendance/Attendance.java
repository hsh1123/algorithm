package Attendance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Attendance {
    /***
     * N명의 사람들의 이름과 키 정보를 가지고 있는 출석부
     * 순서는 이름을 기준으로 사전 순서로 정렬, 이름이 같다면 작은 키에서 큰 키로 오름차순 정렬
     * 이름과 키 모드 같은 사람은 없음
     * 키는 소수점 2번째 자리까지 표기
     * 모든 사람이 주어졌을 때 출석부를 완성하고 K번째 있는 사람의 이름과 키를 공백을 두고 출력하시오
     *
     */
    public Map<String,Double> example (){

        Map<String,Double> attendance = this.setAttendance();
        List<Map<String,Double>> attendanceCount = new ArrayList<>();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        input = br.readLine();
//        System.out.println("Hello Goorm! Your input is " + input);
//        String input = null;
        int cnt=3;

        attendanceCount.add(attendance);
        System.out.println(attendance.get("abc"));


        return null;
    }

    public Map<String,Double> setAttendance(){

        Map<String,Double> attendance = new HashMap<>();

        attendance.put("abc",172.53);
        attendance.put("abcd",171.02);
        attendance.put("cdef",176.22);
        attendance.put("bcde",190.15);
        attendance.put("cdef",172.24);
        attendance.put("cdefg",172.98);


        return attendance;
    };





}
