package com.dzencake.dtss.widget;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.dzencake.dtss.R;
import com.dzencake.dtss.model.Movie;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MovieAdapter extends RecyclerView.Adapter<BinderViewHolder> {

	private final List<Movie> mMovieList = new ArrayList<>();

	@Inject
	public MovieAdapter(List<Movie> movieList) {
		mMovieList.addAll(movieList);
	}

	@Override
	public BinderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new MovieViewHolder(LayoutInflater.from(parent.getContext())
				.inflate(R.layout.item_movie, parent, false));
	}

	@Override
	public void onBindViewHolder(BinderViewHolder holder, int position) {
		holder.bind(mMovieList.get(position));
	}

	@Override
	public int getItemCount() {
		return mMovieList.size();
	}
}
