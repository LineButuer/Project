package project.community;

import java.util.ArrayList;
import java.util.List;

public class CommunityRepository {
    List<CommunityDTO> communityDTOList = new ArrayList<>();
    public boolean updateHits(Long id){
        for(CommunityDTO communityDTO : communityDTOList){
            if(id.equals(communityDTO.getId())){
                int hits = communityDTO.getComHits();
                hits += 1;
                communityDTO.setComHits(hits);
                return true;
            }
        }return false;
    }

    public boolean save(CommunityDTO communityDTO) {
        return communityDTOList.add(communityDTO);
    }

    public boolean comList() {
        for (int i = 0; i < communityDTOList.size(); i++) {
            System.out.println(communityDTOList.get(i));
        }return true;
    }
    public CommunityDTO findCom(Long id){
        for (CommunityDTO communityDTO : communityDTOList){
            if(id.equals(communityDTO.getId())){
                return communityDTO;
            }
        }return null;
    }
    public CommunityDTO hottest(){
        for(CommunityDTO communityDTO : communityDTOList){
            if(communityDTO.getComHits()>=10){
                return communityDTO;
            }
        }return null;
    }
    public boolean search(){

    }
}

