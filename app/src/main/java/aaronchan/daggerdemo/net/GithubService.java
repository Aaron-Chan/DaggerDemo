package aaronchan.daggerdemo.net;

import java.util.List;

import aaronchan.daggerdemo.model.Repository;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Administrator on 2016/4/13.
 */
public interface GithubService {
    @GET("/org/{org}/repos")
    Call<List<Repository>> listRepos(@Path("org") String org);
}
