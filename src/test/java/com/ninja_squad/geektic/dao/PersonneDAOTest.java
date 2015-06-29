package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import com.ninja_squad.geektic.objets.Personne;
import com.ninja_squad.geektic.objets.Sexe;
import com.ninja_squad.geektic.service.PersonneService; 
public class PersonneDAOTest extends BaseDaoTest{

	private PersonneDAO mockDao;
    private PersonneService PersonneService;

    @Before
    public void setUp() throws Exception {
        mockDao = mock(PersonneDAO.class);
        PersonneService = new PersonneService(mockDao);
    }

    @Test
    public void shouldUseDaoTrouver() throws Exception {
    	Personne personneOne = new Personne("BlackBird","Jessica",17, Sexe.Femme, "JessicaDu69@gmail.com","TmtcSisiLaFamille");
    	Personne personneTwo = new Personne("Quatiglininini","Jordan",12, Sexe.Homme, "JojoDu69@gmail.com","MinecraftLetsPlay");
        Stream<Personne> str = Stream.of(personneOne, personneTwo);
//        when(mockDao.getAll()).thenReturn(str);
//
//        Stream<Personne> found = PersonneService.listeUtilisateur();
//        
    }
}
