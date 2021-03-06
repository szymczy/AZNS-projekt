package pl.ue.project.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookWithoutAuthorAndCopiesDto {
    private Long id;
    private String title;
}
