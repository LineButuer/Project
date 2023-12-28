package project.member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO>memberDTOList = new ArrayList<>();

    public MemberDTO idCheck(String id){
        for(MemberDTO memberDTO : memberDTOList){
            if(id.equals(memberDTO.getMemberId())){
                return memberDTO;
            }
        }return null;
    }
    public boolean signUp(MemberDTO memberDTO){
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO logIn(String id, String passWord){
        for(MemberDTO memberDTO : memberDTOList){
            if(id.equals(memberDTO.getMemberId())&&passWord.equals(memberDTO.getMemberPassWord())){
                return memberDTO;
            }
        }return null;
    }

}
