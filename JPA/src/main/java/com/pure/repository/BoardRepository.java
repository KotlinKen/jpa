package com.pure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pure.model.Board;

public interface BoardRepository  extends JpaRepository<Board, Long>{
	

}
