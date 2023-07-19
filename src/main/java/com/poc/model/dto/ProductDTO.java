package com.poc.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.poc.model.common.AuditModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ProductDTO extends AuditModel {

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double price;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productType;
}
