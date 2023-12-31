package com.project.exam_reminder.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExamReqDTO {
    private int examId;
    private String stime;
    private String etime;
    private String date;
    private String venue;
    private int courseId;
    private int lectureId;


}

