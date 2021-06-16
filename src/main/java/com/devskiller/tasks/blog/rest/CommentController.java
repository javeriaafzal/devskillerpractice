package com.devskiller.tasks.blog.rest;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devskiller.tasks.blog.model.dto.CommentDto;
import com.devskiller.tasks.blog.service.CommentService;

@Controller
@RestController

public class CommentController {

	private final CommentService commentService;


	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}

	
	@GetMapping(path = "/posts/{postId}/comments")
	@ResponseStatus(HttpStatus.OK)
	public List<CommentDto> getCommentsForPost(@PathVariable Long postId) {
		return commentService.getCommentsForPost(postId);
	}


}
