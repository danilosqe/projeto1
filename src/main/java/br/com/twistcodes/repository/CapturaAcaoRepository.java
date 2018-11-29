package br.com.twistcodes.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.twistcodes.entity.CapturaAcao;

public interface CapturaAcaoRepository extends MongoRepository<CapturaAcao, Long> {

	CapturaAcao findByRgm(String rgm);
	
	CapturaAcao findByRgmIgnoreCase(String rgm);
	
}

