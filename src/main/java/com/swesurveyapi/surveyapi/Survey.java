package com.swesurveyapi.surveyapi;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="surveylist")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstname",nullable = false)
    private String firstname;

    @Column(name = "lastname",nullable = false)
    private String lastname;

    @Column(name = "streetaddr",nullable = false)
    private String streetaddr;

    @Column(name="city",nullable = false)
    private String city;

    @Column(name="state",nullable = false)
    private String state;

    @Column(name="zip",length=5,nullable = false)
    private Integer zip;

    @Column(name="phnum",length=10,nullable = false)
    private long phnum; 

    @Column(name="email",nullable = false)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name="surveydate",nullable = false)
    private Date surveydate;

    @Column(name="campuslikes",nullable = true)
    @Enumerated(EnumType.STRING)
    private CampusLikes campuslikes;

    @Column(name="hearus",nullable = true)
    @Enumerated(EnumType.STRING)
    private HeardCampus hearus;


    @Column(name="recommendation",nullable = true)
    @Enumerated(EnumType.STRING)
    private Recommendation recommendation;

    @Column(name="comments",nullable = true)
    private String comments;



    public long getphnum() {
        return phnum;
    }

    public void setphnum(long phnum) {
        this.phnum = phnum;
    }


    public String getcomments() {
        return comments;
    }

    public void setcomments(String comments) {
        this.comments = comments;
    }

    public Recommendation getrecommendation() {
        return recommendation;
    }

    public void setrecommendation(Recommendation Recommendation) {
        this.recommendation = Recommendation;
    }

    
    public HeardCampus gethearus() {
        return hearus;
    }

    public void sethearus(HeardCampus hearus) {
        this.hearus = hearus;
    }

    public CampusLikes getcampuslikes() {
        return campuslikes;
    }

    public void setcampuslikes(CampusLikes campuslikes) {
        this.campuslikes = campuslikes;
    }

    public Date getsurveydate() {
        return surveydate;
    }

    public void setsurveydate(Date surveydate) {
        this.surveydate = surveydate;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    
    public Integer getzip() {
        return zip;
    }

    public void setzip(Integer zip) {
        this.zip = zip;
    }

    public String getstate() {
        return state;
    }

    public void setstate(String state) {
        this.state = state;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getstreetaddr() {
        return streetaddr;
    }

    public void setstreetaddr(String streetaddr) {
        this.streetaddr = streetaddr;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

       public enum CampusLikes{
        STUDENTS,
        LOCATION,
        CAMPUS,
        ATMOSPHERE,
        DORMROOMS,
        SPORTS
     }

     public enum HeardCampus{
        FRIENDS,
        TV,
        INTERNET,
        OTHERS
     }

     public enum Recommendation{
        VERYLIKELY,
        LIKELY,
        UNLIKELY
     }

    
}
