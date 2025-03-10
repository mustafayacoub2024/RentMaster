package org.example.rentmaster.service;

import org.example.rentmaster.model.dto.request.TechnigueTypeDataRequest;
import org.example.rentmaster.model.dto.response.TechnigueTypeDataResponse;

public interface TechnigueTypeService {
    TechnigueTypeDataResponse postType(TechnigueTypeDataRequest technigueTypeDataRequest);
}
