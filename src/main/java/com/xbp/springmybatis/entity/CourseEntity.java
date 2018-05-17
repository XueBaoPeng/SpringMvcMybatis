package com.xbp.springmybatis.entity;

import java.io.Serializable;

public class CourseEntity implements Serializable {
    private Integer id;

    private String name;

    private Integer textbookId;

    private Integer gradeId;

    private static final long serialVersionUID = 1L;

    public CourseEntity(Integer id, String name, Integer textbookId, Integer gradeId) {
        this.id = id;
        this.name = name;
        this.textbookId = textbookId;
        this.gradeId = gradeId;
    }

    public CourseEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(Integer textbookId) {
        this.textbookId = textbookId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CourseEntity other = (CourseEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTextbookId() == null ? other.getTextbookId() == null : this.getTextbookId().equals(other.getTextbookId()))
            && (this.getGradeId() == null ? other.getGradeId() == null : this.getGradeId().equals(other.getGradeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTextbookId() == null) ? 0 : getTextbookId().hashCode());
        result = prime * result + ((getGradeId() == null) ? 0 : getGradeId().hashCode());
        return result;
    }
}