package com.mj.libs_recyclerview.base;

/**
 * Created by kim on 2018/8/2.
 * 抽象类，接受一个范型T(Cell接受的数据实体)，
 * 实现了releaseResource方法，但什么事也没干，
 * 因为有很多简单的Cell没有资源回收，就不需要实现。如果子类Cell 有资源回收，重写这个方法就可以了
 */

public  abstract  class RVBaseCell<T> implements Cell {
    public T mData;
    public RVBaseCell(T t){
        mData=t;
    }
    @Override
    public void releaseResource(){
         //回收资源
    }


}
