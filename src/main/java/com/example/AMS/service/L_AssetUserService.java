// com.example.Login.service.L_AssetUserService
package com.example.AMS.service;

import com.example.AMS.model.AssetUser;
import com.example.AMS.repository.L_AssetUserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class L_AssetUserService {
    private final L_AssetUserRepository assetUserRepository;

    public L_AssetUserService(L_AssetUserRepository assetUserRepository) {
        this.assetUserRepository = assetUserRepository;
    }

    public List<AssetUser> getAllUserHistories() {
        return assetUserRepository.findAllByOrderByUserNameAscStartDateDesc();
    }

    public List<AssetUser> getUserHistoryByUserName(String userName) {
        return assetUserRepository.findByUserName(userName);
    }

    public List<AssetUser> getAssetHistory(String assetId) {
        return assetUserRepository.findByAsset_AssetId(assetId);
    }

    public AssetUser saveAssetUser(AssetUser assetUser) {
        return assetUserRepository.save(assetUser);
    }

    public AssetUser getUserHistoryById(Long id) {
        return assetUserRepository.findById(id).orElse(null);
    }

}

