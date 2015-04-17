package com.dzencake.dtss.dagger;

import com.dzencake.dtss.widget.MovieAdapter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MovieModule.class})
public interface MovieComponent {
	MovieAdapter provideMovieAdapter();
}
