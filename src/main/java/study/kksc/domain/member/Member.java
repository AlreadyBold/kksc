package study.kksc.domain.member;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String student_id; // 학번

    private String email;
    private String password;

    private String name;
    private Long grade; // 학년
    private Long age;
    private String gender;
    private String addr;
    private String phoneNum;

    private LocalDateTime createdAt;

    public Member() {
    }

    public Member(Long id, String student_id, String email, String password, String name,
                  Long grade, Long age, String gender, String addr, String phoneNum, LocalDateTime createdAt) {
        this.id = id;
        this.student_id = student_id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
        this.phoneNum = phoneNum;
        this.createdAt = createdAt;
    }
}
