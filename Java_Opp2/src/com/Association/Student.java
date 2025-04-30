package com.Association;

public class Student {

    private String name;
    private Course course; //넓은 의미로 .. 연관관계 <-> 아직 내부에서 생성안했을때

    public Student(String name) {
        this.name = name;
        course = null; //초기에는 수강을 하지 않음!
    }

    //수강을 듣다.(과목에 대한 정보는 course 에 있다.)
    void enroll(Course course){
        this.course = course;
        System.out.println(name + "가" + course.getName() + "강의를 수강합니다");
    }
    //학생의 현재 수강중인 상태를 보여주는 기능
    public void showCourse() {
        if(this.course != null){
            System.out.println(name + "이(가)" + this.course.getName() + "을 수강 하고 있는 중");
        }else{
            System.out.println("수강중인 강의가 없습니다");
        }
    }
    public void end(){
        if(course == null){
            System.out.println("이미 수강중인 상태가 아닙니다");
        }else{
            System.out.println(course.getName() + " 을 수강 취소 합니다.");
        }
        this.course = null;
        System.out.println("수강 취소 완료");
    }
}
