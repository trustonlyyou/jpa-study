package me.whiteship.demospringdata;

import jakarta.persistence.*;

import java.util.Date;

@Entity // Account 라는 Table 에 Mapping 되는 어노테이션
@Table // 기본 값이 @Entity 이름과 동일한 테이블과 매핑된다.
public class Account {
    /**
     * 엔티티의 주키를 매핑할 때 사용
     * 자바의 모든 primitive 타입과 그 랩퍼타입을 사용 가능
     * Date 랑 BingDecimal, BinInteger 도 사용 가능
     * 복합키를 만드는 매핑하는 방법도 있지만 그건 논외로
     */
    @Id
    /**
     * 주키를 생성 방법을 매핑하는 애노테이션
     * 생성 전략과 생성기를 설정할 수 있다.
     * 기본 전략은 AUTO : 사용한는 DB에 따라서 적절한 전략 선택
     * TABLE, SEQUENCE, IDENTITY 중 하나
     */
    @GeneratedValue
    private Long id;

    // @Column @Entity 때문에 생략 되어 있는거나 마찬가지
    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created = new Date();

    @Transient // 컬럼으로 맵핑하고 싶지 않은 멤버
    private String no;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
