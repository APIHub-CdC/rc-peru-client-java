package io.rc.pe.client.api;

import io.rc.pe.client.ApiClient;
import io.rc.pe.client.ApiException;
import io.rc.pe.client.ApiResponse;
import io.rc.pe.client.Configuration;
import io.rc.pe.client.Pair;
import io.rc.pe.client.ProgressRequestBody;
import io.rc.pe.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.rc.pe.client.model.Peticion;
import io.rc.pe.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReporteCreditoPeruApi {
    private ApiClient apiClient;
    public ReporteCreditoPeruApi() {
        this(Configuration.getDefaultApiClient());
    }
    public ReporteCreditoPeruApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getRCCall(String xApiKey, String username, String password, Peticion request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    private okhttp3.Call getRCValidateBeforeCall(String xApiKey, String username, String password, Peticion request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getRC(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getRC(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getRC(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling getRC(Async)");
        }
        
        okhttp3.Call call = getRCCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta getRC(String xApiKey, String username, String password, Peticion request) throws ApiException {
        ApiResponse<Respuesta> resp = getRCWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<?> getGenericRC(String xApiKey, String username, String password, Peticion request) throws ApiException {
        ApiResponse<?> resp = getRCWithHttpInfo(xApiKey, username, password, request);
        return resp;
    }    
    
    public ApiResponse<Respuesta> getRCWithHttpInfo(String xApiKey, String username, String password, Peticion request) throws ApiException {
        okhttp3.Call call = getRCValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    

}
