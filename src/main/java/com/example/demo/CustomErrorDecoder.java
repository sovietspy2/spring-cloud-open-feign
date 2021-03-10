package com.example.demo;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
        @Override
        public Exception decode(String methodKey, Response response) {

            switch (response.status()){
                case 400:
                    return new Exception("400");
                case 404:
                    return new Exception("404");
                default:
                    return new Exception("Generic error");
            }
        }
}
