package com.dzencake.dtss;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dzencake.dtss.dagger.DaggerMovieComponent;
import com.dzencake.dtss.dagger.MovieComponent;
import com.dzencake.dtss.dagger.MovieModule;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MovieComponent component = DaggerMovieComponent
				.builder()
				.movieModule(new MovieModule())
				.build();
		RecyclerView list = (RecyclerView) findViewById(R.id.list);
		list.setLayoutManager(new LinearLayoutManager(this));
		list.setAdapter(component.provideMovieAdapter());
	}
}
