/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Lyle
 */
public class Results {
    
    private String studentNumber, mathsResult,ITResults;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMathsResult() {
        return mathsResult;
    }

    public void setMathsResult(String mathsResult) {
        this.mathsResult = mathsResult;
    }

    public String getITResults() {
        return ITResults;
    }

    public void setITResults(String ITResults) {
        this.ITResults = ITResults;
    }

    @Override
    public String toString() {
        return "Results{" + "studentNumber=" + studentNumber + ", mathsResult=" + mathsResult + ", ITResults=" + ITResults + '}';
    }
    
    
    
}
