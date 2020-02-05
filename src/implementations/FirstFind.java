/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.IUnionFind;


/**
 *
 * @author stanislavnovitski
 */
public class FirstFind implements IUnionFind {

    private int count = 0;
    private int[] pointSets = null;

    public FirstFind(int n) {
        this.count = n;
        this.pointSets = pointSets = new int[n];
        for (int i = 0; i < pointSets.length; i++) {
            pointSets[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        for (int i = 0; i < pointSets.length; i++) {
            if (pointSets[i] == pointSets[p]) {
                pointSets[i] = pointSets[q];
            }
        }
        this.count--;
    }

    @Override
    public int find(int p) {
        return pointSets[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return this.find(p) == this.find(q);
    }

    @Override
    public int count() {
        return count;
    }

}