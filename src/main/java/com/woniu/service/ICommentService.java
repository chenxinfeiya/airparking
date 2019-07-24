package com.woniu.service;

import java.util.List;

import com.woniu.model.Comment;

public interface ICommentService {
		void addComment(Comment comment);
		void delComment(Comment comment);
		void updateComment(Comment Comment);
		Comment findOne(String commentid);
		List<Comment> findAll();
}
