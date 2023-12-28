package project.member;

public class MemberDTO {
    private Long id;
    private String memberId;
    private String memberPassWord;
    private String company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPassWord() {
        return memberPassWord;
    }

    public void setMemberPassWord(String memberPassWord) {
        this.memberPassWord = memberPassWord;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private static Long idValue = 1L;

    public MemberDTO(String memberId, String memberPassWord, String company) {
        this.id = idValue++;
        this.memberId = memberId;
        this.memberPassWord = memberPassWord;
        this.company = company;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberId='" + memberId + '\'' +
                ", memberPassWord='" + memberPassWord + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
