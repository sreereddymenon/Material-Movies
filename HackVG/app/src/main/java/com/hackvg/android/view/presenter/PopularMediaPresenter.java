package com.hackvg.android.view.presenter;

import com.hackvg.android.model.entities.TvMovie;

import java.util.List;

/**
 * Created by saulmm on 31/01/15.
 */
public interface PopularMediaPresenter {

    public void onPopularShowsReceived(List<TvMovie> movieList);

    public void onResume ();

    void onPopularMoviesReceived(List<TvMovie> popularMovies);
}
