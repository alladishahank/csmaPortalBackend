package com.accelq.csma_portal.DTO;

public class AssessmentScoreDTO {
    private Integer parameterId;
    private String parameterName;
    private Double score;

    // Getters and Setters

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
