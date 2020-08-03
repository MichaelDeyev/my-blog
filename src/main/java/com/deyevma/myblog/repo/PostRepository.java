package com.deyevma.myblog.repo;

import com.deyevma.myblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
