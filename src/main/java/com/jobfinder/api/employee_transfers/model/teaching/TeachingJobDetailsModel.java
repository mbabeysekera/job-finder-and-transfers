package com.jobfinder.api.employee_transfers.model.teaching;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(schema = "teaching", name = "teaching_job_details")
@AllArgsConstructor
@NoArgsConstructor
public class TeachingJobDetailsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "primary_subject_for_primary_level")
    private String primarySubjectForPLevel;

    @Column(name = "secondary_subject_for_primary_level")
    private String secondarySubjectForPLevel;

    @Column(name = "ternary_subject_for_primary_level")
    private String ternarySubjectForPLevel;

    @Column(name = "primary_subject_for_o_level")
    private String primarySubjectForOLevel;

    @Column(name = "secondary_subject_for_o_level")
    private String secondarySubjectForOLevel;

    @Column(name = "ternary_subject_for_o_level")
    private String ternarySubjectForOLevel;

    @Column(name = "primary_subject_for_a_level")
    private String primarySubjectForALevel;

    @Column(name = "secondary_subject_for_a_level")
    private String secondarySubjectForALevel;

    @Column(name = "ternary_subject_for_a_level")
    private String ternarySubjectForALevel;

}
