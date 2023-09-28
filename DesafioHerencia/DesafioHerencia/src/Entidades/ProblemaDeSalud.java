/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan
 */
public class ProblemaDeSalud {
    /*
    N° de orden del integrante, IDE de familia, 
    HTA (verdadero o falso, si tiene hipertension),
    DBT (verdadero o falso si tiene diabetes)).
    */
    protected Integer numOrden, IDEFamilia;
    protected boolean HTA, DBT;

    public ProblemaDeSalud() {
    }

    public ProblemaDeSalud(Integer numOrden, Integer IDEFamilia, boolean HTA, boolean DBT) {
        this.numOrden = numOrden;
        this.IDEFamilia = IDEFamilia;
        this.HTA = HTA;
        this.DBT = DBT;
    }
    
    
}
