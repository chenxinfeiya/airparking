package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.AuditMapper;
import com.woniu.mapper.CommentMapper;
import com.woniu.model.Audit;
import com.woniu.model.Comment;
import com.woniu.service.IAuditService;
import com.woniu.service.ICommentService;

@Service
public class CommentServiceImpl implements ICommentService {
    @Resource
    private CommentMapper commentMapper;


	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		commentMapper.insert(comment);
	}

	@Override
	public void delComment(Comment comment) {
		comment.setIsdelete(true);
		commentMapper.updateByPrimaryKeySelective(comment);
	}

	@Override
	public void updateComment(Comment Comment) {
		// TODO Auto-generated method stub
		commentMapper.updateByPrimaryKeySelective(Comment);
	}

	@Override
	public Comment findOne(String commentid) {
		// TODO Auto-generated method stub
		return commentMapper.selectByPrimaryKey(commentid);
	}

}

