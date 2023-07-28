package com.swesurveyapi.surveyapi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface SweSurveyRepository extends JpaRepository<Survey,Integer>{

    List<Survey> findAll();
    Survey findById(int id);
    int deleteById(int id);
}
