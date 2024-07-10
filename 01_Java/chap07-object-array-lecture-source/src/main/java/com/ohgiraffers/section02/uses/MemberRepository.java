package com.ohgiraffers.section02.uses;

public class MemberRepository {

   private final static Member[] members;
   private static int count;

   static {
       members = new Member[10];
   }

    public static boolean store(Member[] newMembers) {

       /* 설명. for-each문을 사용 */
        for(Member m : newMembers) {
            MemberRepository.members[count ++] = m;
        }

        /* 설명. 전통적인 for문을 사용 */
        for(int i = 0; i <= newMembers.length -1; i++) {
            /* 설명. option #1 */
//            MemberRepository.members[i] = newMembers[i];
//            count ++;
            /* 설명. option #1 */
//            MemberRepository.members[count ++] = newMembers[count - 1];
        }
        return true;
    }

    public static Member[] findAllMembers() {
       return MemberRepository.members;
    }
}
