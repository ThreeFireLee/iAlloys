package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by liyan
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
