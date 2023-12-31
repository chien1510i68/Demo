package com.example.nmd.repository;

import com.example.nmd.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerRepository extends JpaRepository<Banner , Long> {
    List<Banner> findBannersByType(String type);
}
