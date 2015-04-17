package com.dzencake.dtss.dagger;

import android.net.Uri;

import com.dzencake.dtss.model.Movie;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MovieModule {

	@Provides @Singleton
	public List<Movie> provideMovies() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("Kingsman: Секретная служба",
				"A spy organization recruits an unrefined, but promising street kid into the agency's ultra-competitive training program, just as a global threat emerges from a twisted tech genius.",
				Uri.parse("http://ia.media-imdb.com/images/M/MV5BMTkxMjgwMDM4Ml5BMl5BanBnXkFtZTgwMTk3NTIwNDE@._V1__SX1301_SY664_.jpg")));
		movieList.add(new Movie("Инсургент",
				"Beatrice Prior must confront her inner demons and continue her fight against a powerful alliance which threatens to tear her society apart with the help from others on her side.",
				Uri.parse("http://ia.media-imdb.com/images/M/MV5BMTgxOTYxMTg3OF5BMl5BanBnXkFtZTgwMDgyMzA2NDE@._V1__SX1301_SY664_.jpg")));
		movieList.add(new Movie("Интерстеллар",
				"A team of explorers travel through a wormhole in an attempt to ensure humanity's survival.",
				Uri.parse("http://ia.media-imdb.com/images/M/MV5BMjIxNTU4MzY4MF5BMl5BanBnXkFtZTgwMzM4ODI3MjE@._V1__SX1301_SY664_.jpg")));
		return movieList;
	}
}
