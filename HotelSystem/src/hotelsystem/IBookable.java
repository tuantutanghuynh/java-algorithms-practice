package hotelsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tangh
 */
public interface IBookable {
    void PrintInfo();
    double CalcCost(int nights);
    boolean IsAvailable();
}
