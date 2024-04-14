package study.kksc.domain.member;

import lombok.Data;

@Data
public class MemberDto {

    private Long id;
    private String password;
    private String cPassword;

}
