package idusw.sb.practice.Repository;

import idusw.sb.practice.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);  // 중복 검사용
}
