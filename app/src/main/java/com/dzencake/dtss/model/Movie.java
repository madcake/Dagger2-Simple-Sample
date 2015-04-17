package com.dzencake.dtss.model;

import android.net.Uri;

public class Movie {
	public final String title;
	public final String description;
	public final Uri coverUrl;

	public Movie(String title, String description, Uri coverUrl) {
		this.title = title;
		this.description = description;
		this.coverUrl = coverUrl;
	}
}
