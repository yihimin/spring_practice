package idusw.sb.practice.Controller;

import idusw.sb.practice.Entity.Member;
import idusw.sb.practice.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/join")
    public String join(@RequestBody Member member) {
        memberService.join(member);
        return "가입 완료!";
    }

    @GetMapping("")
    public List<Member> list() {
        return memberService.getMembers();
    }

    @GetMapping("/{id}")
    public Member getOne(@PathVariable Long id) {
        return memberService.getMember(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        memberService.deleteMember(id);
        return "삭제 완료!";
    }

}
