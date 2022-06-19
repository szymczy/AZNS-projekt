package pl.ue.project.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ReaderDto {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Long> borrowedCopiesIds;
}
