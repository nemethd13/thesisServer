package hu.unideb.danasis.service.api.service;

import hu.unideb.danasis.service.api.vo.ExercisesVO;

import java.util.List;

public interface ExercisesService {

    List<ExercisesVO> findAll();

    ExercisesVO findById(Long id);
}
