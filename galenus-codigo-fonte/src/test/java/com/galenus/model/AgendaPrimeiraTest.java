//package com.galenus.model;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.sql.Timestamp;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//class AgendaPrimeiraTest {
//
//    @Mock
//    Timestamp dataHora;
//    @InjectMocks
//    AgendaPrimeira agendaPrimeira;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testSetId() {
//        agendaPrimeira.setId(0);
//        assertEquals(1, agendaPrimeira.getId());
//    }
//
//    @Test
//    void testSetNomePaciente() {
//        agendaPrimeira.setNomePaciente("nomePaciente");
//    }
//
//    @Test
//    void testSetTelefone() {
//        agendaPrimeira.setTelefone("telefone");
//    }
//
//    @Test
//    void testSetDataHora() {
//        agendaPrimeira.setDataHora(null);
//    }
//
//    @Test
//    void testSetMedicoCrm() {
//        agendaPrimeira.setMedicoCrm("medicoCrm");
//    }
//}