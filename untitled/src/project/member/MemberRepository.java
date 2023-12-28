package project.member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO>memberDTOList = new ArrayList<>();

    public boolean idCheck(String id){
        boolean result =false;
        for(MemberDTO memberDTO : memberDTOList){
            if(id.equals(memberDTO.getMemberId())){
               result =true;
            }
        }return result;
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
