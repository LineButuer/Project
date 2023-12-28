package project.community;

import project.member.MemberDTO;

public class CommunityDTO {
    private Long id;
    private String contents;
    private String nickName;
    private int comHits = 0;

    public int getComHits() {
        return comHits;
    }

    public void setComHits(int comHits) {
        this.comHits = comHits;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    private static Long idVlaue =1L;


    @Override
    public String toString() {
        return "게시글[" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comHits=" + comHits +
                ']';
    }

    public CommunityDTO(String nickName, String contents) {
        this.id = idVlaue++;
        this.contents = contents;
        this.nickName = nickName;
        this.comHits = 0;

    }
}
