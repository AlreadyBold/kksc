package study.kksc.domain.member;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) throws Exception {
        // 중복 확인
        if (memberRepository.existsById(member.getId())) {
            throw new Exception("이미 존재하는 사용자입니다.");
        }

        //유효성 검사
        if (member.getPassword().length() < 4) {
            throw new Exception("비밀번호가 너무 짧습니다.");
        }

        //저장
        memberRepository.save(member);
    }

    public void signOut() {
        return;
    }

    public void login(MemberDto memberDto) { // dto - da
        Optional<Member> member = memberRepository.findById(memberDto.getId());
    }

    public void updateInfo() {
        return;
    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).get();
    }
}
