package study.datajpa.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class MemberDto {
    private Long id;
    private String username;
    private String teamName;
}
