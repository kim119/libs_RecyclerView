package com.mj.libs_recyclerview.base;

import android.view.ViewGroup;

/**
 * Created by kim on 2018/8/2.
 * 定义了4个方法，除了回收资源的方法releaseResource（），
 * 其它三个和Adapter中的一样
 */

public interface Cell {
    /**
     * 回收资源
     */
    public void releaseResource();
    /**
     * 获取viewType
     */
    public int getItemType();
    /**
     * 创建viewHolder
     * @param  parent
     * @param  viewtype
     * @return
     */
        public RVBaseViewHolder onCreateViewHolder(ViewGroup parent,int viewtype);

    /**
     * 数据绑定
     * @param holder
     * @param position
     *
     */
    public void onBindViewHolder(RVBaseViewHolder holder,int position);


}
