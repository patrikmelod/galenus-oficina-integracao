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
//import static org.mockito.Mockito.*;
//
//class AgendaTest {
//    @Mock
//    Timestamp dataHora;
//    @InjectMocks
//    Agenda agenda;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testSetId() {
//        agenda.setId(0);
//    }
//
//    @Test
//    void testSetDocPaciente() {
//        agenda.setDocPaciente("docPaciente");
//    }
//
//    @Test
//    void testSetTelefone() {
//        agenda.setTelefone("telefone");
//    }
//
//    @Test
//    void testSetDataHora() {
//        agenda.setDataHora(null);
//    }
//
//    @Test
//    void testSetMedicoCrm() {
//        agenda.setMedicoCrm("medicoCrm");
//    }
//}