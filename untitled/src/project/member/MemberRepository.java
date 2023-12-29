package project.member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();

    public MemberDTO idCheck(String id) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (id.equals(memberDTO.getMemberId())) {
                return memberDTO;
            }
        }
        return null;
    }

    public MemberDTO nickNameCheck(String nickname) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (nickname.equals(memberDTO.getNickName())) {
                return memberDTO;
            }
        }
        return null;
    }

    public boolean signUp(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO logIn(String id, String passWord) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (id.equals(memberDTO.getMemberId()) && passWord.equals(memberDTO.getMemberPassWord())) {
                return memberDTO;
            }
        }
        return null;
    }

    public boolean editNickName(String nickName) {
        for (MemberDTO memberDTO : memberDTOList) {
            memberDTO.setNickName(nickName);
            return true;
        }
        return false;
    }
    public boolean editCompany(String company){
        for (MemberDTO memberDTO : memberDTOList){
            memberDTO.setCompany(company);
            return true;
        }return false;
    }

}
