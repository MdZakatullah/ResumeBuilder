package com.zak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zak.model.Profile;
import com.zak.service.ProfileService;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping
    public Map<String, Object> saveProfile(@RequestBody Profile profile) {
        Profile savedProfile = profileService.saveProfile(profile);
        return Map.of("success", true, "id", savedProfile.getId());
    }

    @GetMapping
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    @GetMapping("/{id}")
    public Profile getProfileById(@PathVariable Long id) {
        return profileService.getProfileById(id).orElse(null);
    }
    @GetMapping("/prodisplay")
	public String profileDisplay() {
		return "profileDisplay";
	}
}
