package com.hou.service;

import com.hou.dao.ProductInfoRepository;
import com.hou.dataObject.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ken on 2018/9/26.
 */
@Service
public class ProductService {

    @Autowired
    ProductInfoRepository repository;
    ProductInfo findOne(String productId)
    {
        return repository.findByProductId(productId);
    }

    List<ProductInfo> findUpAll()
    {
        return repository.findByProductStatus(0);
    }

}
