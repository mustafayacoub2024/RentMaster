package org.example.rentmaster.controllers;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.rentmaster.model.dto.request.TechnigueTypeDataRequest;
import org.example.rentmaster.model.dto.response.TechnigueTypeDataResponse;
import org.example.rentmaster.service.TechnigueTypeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/type")
public class TechnigueTypeController {

    private final TechnigueTypeService technigueTypeService;

    public TechnigueTypeController(TechnigueTypeService technigueTypeService) {
        this.technigueTypeService = technigueTypeService;
    }

    @PostMapping
    @Operation(summary = "Создать тип строительной технике")
    public TechnigueTypeDataResponse postType (@RequestBody @Valid TechnigueTypeDataRequest technigueTypeDataRequest) {
        return technigueTypeService.postType(technigueTypeDataRequest);
    }
}
