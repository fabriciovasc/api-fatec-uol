package br.gov.sp.fatec.springbootapp.service;

import br.gov.sp.fatec.springbootapp.entity.Registration;

public interface RegistrationService {

    public Registration cadastrarRegistration(String email, String password, String name, String cellphone);
    
}

