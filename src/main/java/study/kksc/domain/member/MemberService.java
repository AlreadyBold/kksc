package study.kksc.domain.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join() {
        return;
    }

    public void signOut() {
        return;
    }

    public void login() {
        return;
    }

    public void updateInfo() {
        return;
    }
}
