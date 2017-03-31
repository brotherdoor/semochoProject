package semo.store.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import semo.domain.Comment;
import semo.domain.Post;
import semo.store.facade.PostStore;
import semo.store.mapper.PostMapper;

public class PostStoreLogic implements PostStore{
	
	private SqlSessionFactory factory;
	
	public PostStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	

	@Override
	public List<Comment> selectComments(String postId) {
		SqlSession session = factory.openSession();
		List<Comment> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.selectComments(Integer.parseInt(postId));
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public void insertComment(String postId, Comment comment) {
		SqlSession session = factory.openSession();
		Map<String, Object> map = new HashMap<>();
		map.put("postId", new Integer(Integer.parseInt(postId)));
		map.put("comment", comment);
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.insertComment(map);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteComment(String commentId) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.deleteComment(Integer.parseInt(commentId));
			session.commit();
		}finally{
			session.close();
		}		
	}

	@Override
	public void deleteCommentByPostId(String postId) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.deleteCommentByPostId(Integer.parseInt(postId));
			session.commit();
		}finally{
			session.close();
		}			
	}

	@Override
	public List<Post> selectPostByCategory(String category) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.selectPostByCategory(category);
		}finally{
			session.close();
		}	
		return list;
	}

	@Override
	public List<Post> selectPostByWriterId(String writerId) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.selectPostByWriterId(writerId);
		}finally{
			session.close();
		}	
		return list;
	}

	@Override
	public List<Post> selectPostByTitle(String title) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		Map<String, String> map = new HashMap<>();
		map.put("title", title);
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.selectPostByTitle(map);
		}finally{
			session.close();
		}	
		return list;
	}

	@Override
	public Post selectPost(String postId) {
		SqlSession session = factory.openSession();
		Post post = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			post = mapper.selectPost(Integer.parseInt(postId));
		}finally{
			session.close();
		}	
		return post;
	}

	@Override
	public List<Post> selectAllPost() {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.selectAllPost();
		}finally{
			session.close();
		}	
		return list;
	}

	@Override
	public int insertPost(Post post) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			int result = mapper.insertPost(post);
			session.commit();
			return result;
		}finally{
			session.close();
		}
	}

	@Override
	public void updatePost(Post post) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.updatePost(post);
			session.commit();
		}finally{
			session.close();
		}		
	}

	@Override
	public void deletePost(String postId) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.deletePost(Integer.parseInt(postId));
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public List<String> selectAlaming(String userId) {
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.selectAlaming(userId);
		}finally{
			session.close();
		}	
		return list;
	}

	@Override
	public void insertAlaming(String userId, String postId) {
		SqlSession session = factory.openSession();
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("postId", postId);
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.insertAlaming(map);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteAlaming(String userId, String postId) {
		SqlSession session = factory.openSession();
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("postId", postId);
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.deleteAlaming(map);
			session.commit();
		}finally{
			session.close();
		}		
	}

	@Override
	public List<Comment> selectContentByAccuse(String postId) {
		SqlSession session = factory.openSession();
		List<Comment> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.selectContentByAccuse(Integer.parseInt(postId));
		}finally{
			session.close();
		}	
		return list;
	}

	@Override
	public boolean checkAccuse(String postId, String userId) {
		SqlSession session = factory.openSession();
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("postNum", new Integer(Integer.parseInt(postId)));
		List<String> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.checkAccuse(map);
			if(list.size() != 0){
				return false;
			}else{
				return true;
			}
		}finally{
			session.close();
		}
	}

	@Override
	public void registerAccuse(String postId, String writerId, String content) {
		SqlSession session = factory.openSession();
		Map<String, Object> map = new HashMap<>();
		map.put("userId", writerId);
		map.put("content", content);
		map.put("postNum", new Integer(Integer.parseInt(postId)));
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.registerAccuse(map);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteAccuse(String postId) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.deleteAccuse(Integer.parseInt(postId));
			session.commit();
		}finally{
			session.close();
		}		
	}

	@Override
	public void updateAccusePostTb(String postId) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			mapper.updateAccusePostTb(Integer.parseInt(postId));
			session.commit();
		}finally{
			session.close();
		}		
	}

}
