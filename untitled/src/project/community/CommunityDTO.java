package project.community;

import project.member.MemberDTO;

public class CommunityDTO {
    private Long id;
    private String title;
    private String contents;
    private String nickName;
    private int comHits = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
        return "CommunityDTO{" +
                "글번호=" + id +
                ", 제목='" + title + '\'' +
                ", 글내용='" + contents + '\'' +
                ", 닉네임='" + nickName + '\'' +
                ", 조회수=" + comHits +
                '}';
    }

    public CommunityDTO(String title, String nickName, String contents) {
        this.id = idVlaue++;
        this.title = title;
        this.contents = contents;
        this.nickName = nickName;
        this.comHits = 0;

    }
}
