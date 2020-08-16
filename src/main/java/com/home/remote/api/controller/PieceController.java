package com.home.remote.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.home.remote.api.entities.Piece;
import com.home.remote.api.service.PieceService;

@RequestMapping
@RestController
public class PieceController {

	@Autowired
	private PieceService  PieceService;

	@JsonIgnore
	@RequestMapping(value = "/Piece/PieceManager", method = RequestMethod.GET)
	public ResponseEntity<List<Piece>> findAll() {
		List<Piece>cat = PieceService.findAllPiece();
		return ResponseEntity.status(HttpStatus.OK).body(cat);
	}

	@RequestMapping(value = "/Piece/PieceById/{id}", method = RequestMethod.GET)
	public Piece getPieceById(@PathVariable("id") Long id) {
		return PieceService.findOnePiece(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Piece/deletePiece")
	public void deletePiece(@RequestBody Piece Piece) {
		PieceService.deletePiece(Piece);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Piece/savePiece")
	public void savePiece(@RequestBody Piece Piece) {
		PieceService.savePiece(Piece);

	}
}
