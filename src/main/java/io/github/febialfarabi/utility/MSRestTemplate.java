package io.github.febialfarabi.utility;

import com.google.gson.Gson;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.http.converter.feed.AtomFeedHttpMessageConverter;
import org.springframework.http.converter.feed.RssChannelHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.http.converter.json.KotlinSerializationJsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.smile.MappingJackson2SmileHttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MSRestTemplate extends RestTemplate {
    java.util.logging.Logger logger = Logger.getLogger(MSRestTemplate.class.getName());
    Gson gson = new Gson();

    public MSRestTemplate() {
        super();
        CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLHostnameVerifier(new NoopHostnameVerifier())
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        this.setRequestFactory(requestFactory);

    }

    @Override
    public <T> ResponseEntity<T> exchange(RequestEntity<?> requestEntity, Class<T> responseType) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+requestEntity.getUrl().toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(RequestEntity<?> requestEntity, ParameterizedTypeReference<T> responseType) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+requestEntity.getUrl().toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, ParameterizedTypeReference<T> responseType) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity =  super.exchange(url, method, requestEntity, responseType);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, ParameterizedTypeReference<T> responseType, Object... uriVariables) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity = super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, ParameterizedTypeReference<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        logger.log(Level.INFO, "HIT :: "+url.toString());
        requestEntity.getHeaders().entrySet().forEach(stringListEntry -> {
            logger.log(Level.INFO, "HIT Header name : "+stringListEntry.getKey()+" #### Header value : "+stringListEntry.getValue().toString());
        });
        logger.log(Level.INFO,"HIT WITH BODY = "+gson.toJson(requestEntity.getBody()));
        ResponseEntity responseEntity = super.exchange(url, method, requestEntity, responseType, uriVariables);
        logger.log(Level.INFO,"RESPONSE = "+ responseEntity.toString());
        return responseEntity;

    }

}
