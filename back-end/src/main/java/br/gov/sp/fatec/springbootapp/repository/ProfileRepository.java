package br.gov.sp.fatec.springbootapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springbootapp.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    public Profile findByHash_audio(String hash_audio);

    public Profile findByHash_webgl(String hash_webgl);

    public Profile findByHash_canvas(String hash_canvas);

}
