package com.ohgiraffers.section02.uses;

public class MemberService {

    Member[] members = new Member[5];

    public void signUpMembers() {

        Member[] members = new Member[5];

        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 20, '여');
        members[2] = new Member(3, "user03", "pass03", "이순신", 20, '남');
        members[3] = new Member(4, "user04", "pass04", "김우빈", 20, '남');
        members[4] = new Member(5, "user05", "pass05", "유재석", 20, '남');

        MemberRegister memberRegister = new MemberRegister();

        memberRegister.regist(members);
    }



    public void getAllMembers() {

        MemberFinder finder = new MemberFinder();

        System.out.println("=================== 가입된 회원 목록 ===================");

        for(Member m : finder.findAllMember()) {
            if(m != null) {
                System.out.println(m.toString());

            }
        }

        System.out.println("========================================================");
    }
}
