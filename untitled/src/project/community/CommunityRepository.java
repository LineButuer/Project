package project.community;

import java.util.ArrayList;
import java.util.List;

public class CommunityRepository {
    List<CommunityDTO> communityDTOList = new ArrayList<>();

    public boolean save(CommunityDTO communityDTO) {
        return communityDTOList.add(communityDTO);
    }

    public boolean comList() {
        for (int i = 0; i < communityDTOList.size(); i++) {
            System.out.println(communityDTOList.get(i));
        }return true;
    }

}

