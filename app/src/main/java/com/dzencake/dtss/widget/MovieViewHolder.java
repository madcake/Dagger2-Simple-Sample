package com.dzencake.dtss.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dzencake.dtss.R;
import com.dzencake.dtss.model.Movie;
import com.squareup.picasso.Picasso;

public class MovieViewHolder extends BinderViewHolder {
	private final TextView mTitle;
	private final ImageView mCover;
	private final TextView mDescription;

	public MovieViewHolder(View itemView) {
		super(itemView);
		mTitle = (TextView) itemView.findViewById(R.id.title);
		mCover = (ImageView) itemView.findViewById(R.id.cover);
		mDescription = (TextView) itemView.findViewById(R.id.description);
	}

	@Override
	public void bind(Object item) {
		Movie movie = (Movie) item;
		mTitle.setText(movie.title);
		mDescription.setText(movie.description);
		Picasso.with(itemView.getContext())
				.load(movie.coverUrl.toString())
				.fit()
				.centerCrop()
				.into(mCover);
	}
}
