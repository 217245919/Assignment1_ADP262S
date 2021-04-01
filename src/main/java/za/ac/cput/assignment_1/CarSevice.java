/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Admin
 */
public class CarSevice {
    double quotePrice;
    String carModel;
    String carName;
    int numOfDeleallers;
    long numPlate;

    public double getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(double quotePrice) {
        this.quotePrice = quotePrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNumOfDeleallers() {
        return numOfDeleallers;
    }

    public void setNumOfDeleallers(int numOfDeleallers) {
        this.numOfDeleallers = numOfDeleallers;
    }

    public long getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(long numPlate) {
        this.numPlate = numPlate;
    }

    @Override
    public String toString() {
        return "Car Service{" + "quotePrice=" + quotePrice + ", carModel=" + carModel + ", carName=" + carName + ", numOfDeleallers=" + numOfDeleallers + ", numPlate=" + numPlate + '}';
    }
    
    
}
