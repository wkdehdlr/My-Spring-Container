import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainerTest {

    @Test
    void getBean_MemberRepository() {
        MemberRepository memberRepository = Container.getBean(MemberRepository.class);
        assertNotNull(memberRepository);
    }

    @Test
    void getBean_MemberService() {
        MemberService memberService = Container.getBean(MemberService.class);
        assertNotNull(memberService);
        assertNotNull(memberService.memberRepository);
    }
}