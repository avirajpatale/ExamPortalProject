package com.app.service;

import java.util.Optional;

import com.app.Entity.PaperSetter;
import com.app.dto.PaperSetterdto;

public interface IPaperSetterService {

	public PaperSetter savePaperSetter(PaperSetterdto dto, PaperSetter transientObj);

	public Optional<PaperSetter> findById(Long id);

	public PaperSetter getByEmail(String email);
	
	public String changePassword(PaperSetterdto details);
}
