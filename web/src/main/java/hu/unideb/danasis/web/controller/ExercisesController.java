package hu.unideb.danasis.web.controller;

import hu.unideb.danasis.service.api.service.ExercisesService;
import hu.unideb.danasis.service.api.vo.ExercisesVO;
import hu.unideb.danasis.service.api.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ExercisesController {

    @Autowired
    ExercisesService exercisesService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/exercises", method = RequestMethod.GET)
    public ResponseEntity<List<ExercisesVO>> getAllExercises() {

        List<ExercisesVO> exercises = exercisesService.findAll();

        System.out.println(exercises);

        if( exercises == null){
            return new ResponseEntity<List<ExercisesVO>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<ExercisesVO>>(exercises, HttpStatus.OK);
    }
}