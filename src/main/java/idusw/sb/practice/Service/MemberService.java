package idusw.sb.practice.Service;

import idusw.sb.practice.Entity.Member;

import java.util.List;


public interface MemberService {
    void join(Member member);
    List<Member> getMembers();
    Member getMember(Long id);
    void deleteMember(Long id);

}
