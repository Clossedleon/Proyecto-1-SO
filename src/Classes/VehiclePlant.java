/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.concurrent.Semaphore;

/**
 *
 * @author isaac
 */
public class VehiclePlant {
    private String name;
    private int maxWorkerQty;
    private Worker[] workers;
    private long dayDurationInMs;
    public Warehouse warehouse;
    public Semaphore mutex;
    
    public VehiclePlant (String name, int maxWorkers, long dayDuration) {
        this.name = name;
        this.maxWorkerQty = maxWorkers;
        this.dayDurationInMs = dayDuration;
        this.workers = new Worker[maxWorkerQty];
        this.warehouse = new Warehouse(20, 30, 20, 20, 20);
        this.mutex = new Semaphore(1);
        
        initializeWorkers();
        
        
    }
    
    public void initializeWorkers(){
        for (int i = 0; i<this.maxWorkerQty; i++) {
            Worker worker = new Worker(0.34f, 20, this.dayDurationInMs, "chasis", this);
            worker.start();
            workers[i] = worker;
        }
    }
}
