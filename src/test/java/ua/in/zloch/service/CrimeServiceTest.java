package ua.in.zloch.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import ua.in.zloch.dto.CategoryDTO;
import ua.in.zloch.dto.CrimeListDTO;
import ua.in.zloch.repository.definition.CrimeDAO;
import ua.in.zloch.repository.dto.CrimeFilter;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.when;

public class CrimeServiceTest {

    @Mock
    private CrimeDAO crimeDAO;

    @Mock
    private ConversionService conversionService;

    @InjectMocks
    private CrimeService crimeService;

    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFilterCrimes() throws Exception {
        when(conversionService.convert(any(ArrayList.class), eq(CrimeListDTO.class)))
                .thenReturn(new CrimeListDTO());

        CrimeListDTO crimesListDTO = crimeService.filterCrimes(new CrimeFilter());

        assertNotNull(crimesListDTO);
    }
}