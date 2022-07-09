package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext // entity manager
    EntityManager em;

    // command + shift + T 로 Test 파일 생

    // 저장
    public Long save(Member member){
        em.persist(member);
        return member.getId();
    }

    // 조회
    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
