package com.devskiller.tasks.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devskiller.tasks.blog.model.dto.CommentDto;
import com.devskiller.tasks.blog.model.dto.NewCommentDto;
import com.devskiller.tasks.blog.repository.CommentRepository;

@Service
public class CommentService {
	
	private final CommentRepository commentRepository;

	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	/**
	 * Returns a list of all comments for a blog post with passed id.
	 *
	 * @param postId id of the post
	 * @return list of comments sorted by creation date descending - most recent first
	 */
	public List<CommentDto> getCommentsForPost(Long postId) {
		return commentRepository.findAll(postId)
			.stream().map(comment -> new CommentDto(comment.getId(), comment.getComment(),comment.getAuthor(), comment.getCreationDate())).orElse(null);
   
				
	
		
	}
	

	/**
	 * Creates a new comment
	 *
	 * @param newCommentDto data of new comment
	 * @return id of the created comment
	 *
	 * @throws IllegalArgumentException if there is no blog post for passed newCommentDto.postId
	 */
	public Long addComment(NewCommentDto newCommentDto) {
		throw new UnsupportedOperationException();
	}
}
