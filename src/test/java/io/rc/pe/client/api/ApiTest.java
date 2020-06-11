package io.rc.pe.client.api;

import io.rc.pe.client.ApiException;
import io.rc.pe.client.model.Peticion;
import io.rc.pe.client.model.Respuesta;
import okhttp3.OkHttpClient;
import io.rc.pe.interceptor.SignerInterceptor;
import io.rc.pe.client.ApiClient;
import io.rc.pe.client.api.ApiTest;
import io.rc.pe.client.api.ReporteCreditoPeruApi;
import io.rc.pe.client.ApiResponse;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;


public class ApiTest {
    
    
    private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
    private final ReporteCreditoPeruApi api = new ReporteCreditoPeruApi();
    private ApiClient apiClient = null;      
    
    private String xApiKey = "your_api_key";
    private String username = "your_username";
    private String password = "your_password";  
    
    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath("the_url");
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void getRCTest() throws ApiException {
        Peticion request = new Peticion();
        Integer estatusOK = 200;
        Integer estatusNoContent = 204;
        
        try {
            
            request.setFolio("100");
            request.setNumeroDocumento("80111521");
            request.setTipoDocumento("1");
            
            ApiResponse<?> response = api.getGenericRC(xApiKey, username, password, request);
  
            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
            
            if(estatusOK.equals(response.getStatusCode())) {
                Respuesta responseOK = (Respuesta) response.getData();
                logger.info(responseOK.toString());
            }
            
        }catch (ApiException e) {
            if(!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }
        
    }
    
}
