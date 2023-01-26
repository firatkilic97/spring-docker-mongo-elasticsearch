package com.haydikodlayalim.api;

import com.haydikodlayalim.entity.Kullanici;
import com.haydikodlayalim.repository.KullaniciRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {

    private final KullaniciRepository kullaniciRepository;

    /*@PostConstruct
    public void init(){
        Kullanici kullanici = new Kullanici();
        kullanici.setAdi("fırat");
        kullanici.setSoyadi("kılıç");
        kullaniciRepository.save(kullanici);
    }*/

    public KullaniciApi(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kulaKullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kulaKullanici));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunuListele() {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }
}
