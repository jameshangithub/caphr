package com.capinfo.engine;

import com.sun.deploy.uitoolkit.impl.awt.AWTAppletAdapter;

/**
 * 保存考核子集
 */
public class AssessmentSubset {
    /**
     * 考核年度
     */
    private String year;


    /**
     * 考核结果
     */
    private String examResults;


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getExamResults() {
        return examResults;
    }

    public void setExamResults(String examResults) {
        this.examResults = examResults;
    }
}