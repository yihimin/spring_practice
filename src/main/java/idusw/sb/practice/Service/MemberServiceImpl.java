package idusw.sb.practice.Service;

import idusw.sb.practice.Entity.Member;
import idusw.sb.practice.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public void join(Member member) {
        if (memberRepository.findByEmail(member.getEmail()) == null) {
            memberRepository.save(member);
        } else {
            throw new IllegalStateException("이미 가입된 이메일입니다");
        }
    }

    @Override
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMember(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("회원이 없어요!"));
    }
    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

}
