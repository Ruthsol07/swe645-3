package com.swesurveyapi.surveyapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SweSurveyController {

    @Autowired
    SweSurveyRepository swesurveyRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String Test() {
        return "swe645 test";
    }

    @CrossOrigin
    @RequestMapping(value = "/surveys", method = RequestMethod.GET)
    @ResponseBody
    public List<Survey> get_surveys() {
        return swesurveyRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/survey", method = RequestMethod.POST)
    @ResponseBody
    public Survey set_survey(@RequestBody Survey survey) {
        try{
        return swesurveyRepository.save(survey);
        }
        catch(Exception ex){
            throw ex;
        }
    }


}
