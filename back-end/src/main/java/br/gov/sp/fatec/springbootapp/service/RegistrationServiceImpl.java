package br.gov.sp.fatec.springbootapp.service;

import java.util.HashSet;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springbootapp.entity.Registration;
import br.gov.sp.fatec.springbootapp.entity.Profile;
import br.gov.sp.fatec.springbootapp.repository.RegistrationRepository;
import br.gov.sp.fatec.springbootapp.repository.ProfileRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository regRepo;

    @Autowired
    private ProfileRepository profRepo;

    @Transactional
    public Registration cadastrarRegistration(String email, String password, String name, String cellphone) {
        Profile prof_audio = profRepo.findByHash_audio(hash_audio);
        Profile prof_webgl = profRepo.findByHash_webgl(hash_webgl);
        Profile prof_canvas = profRepo.findByHash_canvas(hash_canvas);

        Registration reg = regRepo.findByEmail(email);

        if(email == "" || email == null || password == "" || password == null || name == "" || name == null || cellphone == "" || cellphone == null) {
            throw new RuntimeException("Invalid Parameters");
        }
        if(reg == null) {
            Registration registrations = new Registration();
            registrations.setEmail(email);
            registrations.setPassword(autor);
            registrations.setName(editora);
            registrations.getCellphone(editora);
            registrationsRepo.save(registrations);
            if (prof_audio == null && prof_webgl == null && prof_canvas == null) {
                prof = new Profile();
                prof.setHash_audio(hash_audio);
                prof.setHash_webgl(hash_webgl);
                prof.setHash_canvas(hash_canvas);
                prof.setRegistrations(new HashSet<Registration>());
                prof.getRegistrations().add(registrations);
                profRepo.save(prof);
            }
        }
        return registrations;
    }
    
}
