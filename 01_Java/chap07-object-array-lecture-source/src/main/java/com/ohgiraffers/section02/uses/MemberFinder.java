package com.ohgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findAllMember() {
        return MemberRepository.findAllMembers();

    }

    public Member[] findAllMembers() {
        return new Member[0];
    }
}
