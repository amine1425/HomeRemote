package com.home.remote.api.service;

import java.util.List;

import com.home.remote.api.entities.Piece;

public interface PieceService {

	
	void deletePiece(Piece piece);

	List<Piece> findAllPiece();

	Piece findOnePiece(Long pieceId);

	Piece savePiece(Piece piece);
}
