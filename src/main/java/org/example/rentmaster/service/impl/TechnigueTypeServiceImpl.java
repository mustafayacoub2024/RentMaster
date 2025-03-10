package org.example.rentmaster.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.rentmaster.model.db.entity.TechnigueType;
import org.example.rentmaster.model.db.repository.TechnigueTypeRepository;
import org.example.rentmaster.model.dto.request.TechnigueTypeDataRequest;
import org.example.rentmaster.model.dto.response.TechnigueTypeDataResponse;
import org.example.rentmaster.service.TechnigueTypeService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TechnigueTypeServiceImpl implements TechnigueTypeService {

    private final ObjectMapper objectMapper;
    private final TechnigueTypeRepository technigueTypeRepository;

    @Override
    public TechnigueTypeDataResponse postType(TechnigueTypeDataRequest technigueTypeDataRequest) {
        String errMessage = String.format("Такой тип технике уже существует");
        log.error(errMessage);
        TechnigueType technigueType = objectMapper.convertValue(technigueTypeDataRequest, TechnigueType.class);
        TechnigueType technigueTypeSave = technigueTypeRepository.save(technigueType);

        return objectMapper.convertValue(technigueTypeSave, TechnigueTypeDataResponse.class);
    }
}
