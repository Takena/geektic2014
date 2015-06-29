package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
    public void shouldUsemockDaoTrouver() throws Exception {
    	Personne personneOne = new Personne("BlackBird","Jessica",17, Sexe.Femme, "JessicaDu69@gmail.com","TmtcSisiLaFamille");
    	Personne personneTwo = new Personne("Quatiglininini","Jordan",12, Sexe.Homme, "JojoDu69@gmail.com","MinecraftLetsPlay");
        List<Personne> str = new ArrayList();
        str.add(personneOne);
        str.add(personneTwo);
        when(mockDao.getAll()).thenReturn(str);
        
        assertEquals(str,mockDao.getAll());
        
    }
    @Test
    public void findByNomTest() {
    	
    	Personne personneOne = new Personne("BlackBird","Jessica",17, Sexe.Femme, "JessicaDu69@gmail.com","TmtcSisiLaFamille");
    	Personne personneTwo = new Personne("Quatiglininini","Jordan",12, Sexe.Homme, "JojoDu69@gmail.com","MinecraftLetsPlay");
        List<Personne> str = new ArrayList();
        List<Personne> strExpected = new ArrayList();
        str.add(personneOne);
        str.add(personneTwo);
        strExpected.add(personneTwo);
        when(mockDao.getAll()).thenReturn(str);
        when(mockDao.findByNom("Quatiglininini")).thenReturn(strExpected);
    	List<Personne> listePersonne = mockDao.findByNom("Quatiglininini");
    	assertEquals(1, listePersonne.size());
    	assertEquals("Quatiglininini", listePersonne.get(0).getNom());

    }
    @Test
    public void findByPrenomTest() {
    	Personne personneOne = new Personne("BlackBird","Jessica",17, Sexe.Femme, "JessicaDu69@gmail.com","TmtcSisiLaFamille");
    	Personne personneTwo = new Personne("Quatiglininini","Jordan",12, Sexe.Homme, "JojoDu69@gmail.com","MinecraftLetsPlay");
        List<Personne> str = new ArrayList();
        List<Personne> strExpected = new ArrayList();
        str.add(personneOne);
        str.add(personneTwo);
        strExpected.add(personneTwo);
        when(mockDao.getAll()).thenReturn(str);
        when(mockDao.findByPrenom("Jessica")).thenReturn(strExpected);
    	List<Personne> listePersonne = mockDao.findByPrenom("Jessica");
    	assertEquals(1, listePersonne.size());
    	assertEquals("Jessica", listePersonne.get(0).getPrenom());
    	
    }
    
    
    public void findByInteretTest() {
    	List<Personne> listePersonne = mockDao.findByInteret("Windows");
    	assertEquals(1, listePersonne.get(0).getId().intValue());
    	
    }
 
}
