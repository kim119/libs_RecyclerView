package com.mj.libs_recyclerview.base;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kim on 2018/8/2.
 * 以前写Adapter的时候，每一种viewType
 * 都对应了一个ViewHolder,其中有大量的findViewById绑定视图，
 * 有了RVBaseViewHolder，再也不需要定义ViewHolder了，通过id获取View就行，View用SparseArray 保存进行了复用，避免每一次都find。
 */

public class RVBaseViewHolder extends RecyclerView.ViewHolder{
    private SparseArray<View> views;
    private View mItemView;
    public RVBaseViewHolder(View itemView) {
        super(itemView);
        views=new SparseArray<>();
        mItemView=itemView;
    }

    /**
     * 获取ItemView
     * @return
     */
    public View getmItemView(){
        return mItemView;
    }

    public View getView(int resId){

        return retrieveView(resId);
    }
    public TextView getTextView(int resId){
        return retrieveView(resId);
    }
    public ImageView getImageView(int resId){
        return retrieveView(resId);
    }
    public Button getButton(int resId){
        return retrieveView(resId);
    }

    @SuppressWarnings("unchecked")
    protected <V extends View> V retrieveView(int viewId) {
        View view=views.get(viewId);
        if(view==null){
            view=mItemView.findViewById(viewId);
            views.put(viewId,view);
        }
        return (V)view;
    }
    public void setText(int resId ,CharSequence text){
        getTextView(resId).setText(text);
    }

    public void setText(int resId,int strId){
        getTextView(resId).setText(strId);

    }
}
