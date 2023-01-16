package com.misso.votingappbackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//const table_name1 = "members";
//        const table_name2 = "activities";
//        const table_name3 = "activity_log";
//        const table_name4 = "member_committee";
//        const table_name5 = "committees";
//        const table_name6 = "event_attendance";
//        const table_name7 = "mixer_resumes";


@NamedNativeQuery(name = "MyAccount.findMyAccountBy",
        query = "SELECT m.first_name, m.last_name, m.psid, IFNULL(pts.total_points, 0) as total_points, m.email, m.cougarnet, m.major, m.second_major, m.minor, m.classification, m.is_admin, m.created_time, m.updated_time " +
                "FROM members m " +
                "LEFT JOIN (SELECT member_psid, SUM(points) as total_points FROM activity_log al JOIN activities a ON al.activity_code = code GROUP BY member_psid) pts ON pts.member_psid = psid WHERE m.psid = :id",
        resultSetMapping = "Mapping.MyAccount")

@SqlResultSetMapping(
        name = "Mapping.MyAccount",
        entities = {
                @EntityResult(
                        entityClass = MyAccount.class,
                        fields = {
                                @FieldResult(name = "psid", column = "psid"),
                                @FieldResult(name = "first_name", column = "first_name"),
                                @FieldResult(name = "last_name", column = "last_name"),
                                @FieldResult(name = "major", column = "major"),
                                @FieldResult(name = "classification", column = "classification"),
                                @FieldResult(name = "total_points", column = "total_points"),
                        })
        })

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyAccount {
    @Id
    private Integer psid;
    private String first_name;
    private String last_name;
    private String major;
    private String classification;
    private Integer total_points;

    // TODO
    /*
        Send points in header or reuse joint SQL query in node.js backend
     */

    /*
     * Event attendance count for eligibility
     * To run for officer, member must attend certain event type
     */
//    private int pm_count;
//    private int ws_count;
//    private int soc_count;
//    private int vol_count;
//    private int fr_count;
//    private int mentor_count;
//    private int career_count;
//    private int hack_count;

}
