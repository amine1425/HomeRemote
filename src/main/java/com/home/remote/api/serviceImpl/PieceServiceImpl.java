package com.home.remote.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.remote.api.entities.Piece;
import com.home.remote.api.repository.PieceRepository;
import com.home.remote.api.service.PieceService;

@Service
public class PieceServiceImpl implements PieceService{

	@Autowired
	PieceRepository PieceRepository;
	
	@Override
	public void deletePiece(Piece piece) {
		// TODO Auto-generated method stub
		PieceRepository.delete(piece);
	}

	@Override
	public List<Piece> findAllPiece() {
		// TODO Auto-generated method stub
		return PieceRepository.findAll();
	}

	@Override
	public Piece findOnePiece(Long pieceId) {
		// TODO Auto-generated method stub
		return PieceRepository.findOnePieceById(pieceId);
	}

	@Override
	public Piece savePiece(Piece piece) {
		// TODO Auto-generated method stub
		return PieceRepository.save(piece);
	}

}
