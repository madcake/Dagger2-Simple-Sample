package com.dzencake.dtss.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BinderViewHolder extends RecyclerView.ViewHolder {
	public BinderViewHolder(View itemView) {
		super(itemView);
	}

	public abstract void bind(Object item);
}
