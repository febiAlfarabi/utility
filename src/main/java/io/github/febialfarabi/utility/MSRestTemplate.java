package io.github.febialfarabi.utility;

import com.google.gson.Gson;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MSRestTemplate extends RestTemplate {
    java.util.logging.Logger logger = Logger.getLogger(MSRestTemplate.class.getName());
    Gson gson = new Gson();

    @Override
    public <T> ResponseEntity<T> exchange(RequestEntity<?> requestEntity, Class<T> responseType) throws RestClientException {
        logger.log(Level.INFO, "HIT :: {} ", requestEntity.getUrl().toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(RequestEntity<?> requestEntity, ParameterizedTypeReference<T> responseType) throws RestClientException {
        logger.log(Level.INFO,"HIT :: {} ", requestEntity.getUrl().toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType) throws RestClientException {
        logger.log(Level.INFO,"HIT :: {} ", url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables) throws RestClientException {
        logger.log(Level.INFO,"HIT :: {} ", url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        logger.log(Level.INFO,"HIT :: {} ", url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, ParameterizedTypeReference<T> responseType) throws RestClientException {
        logger.log(Level.INFO,"HIT :: {} ", url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, ParameterizedTypeReference<T> responseType, Object... uriVariables) throws RestClientException {
        logger.log(Level.INFO,"HIT :: {} ", url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity = super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, ParameterizedTypeReference<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        logger.log(Level.INFO,"HIT :: {} ", url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : {} #### Header value : {} ", new String[]{stringListEntry.getKey(), stringListEntry.getValue().toString()});
        });
        logger.log(Level.INFO,"HIT WITH BODY = {} ", gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity = super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = {}", responseEntity.toString());
        return responseEntity;

    }

}
