//package com.hisptz.hris.config;
//
//
//import com.hisptz.hris.exception.GraphQLErrorAdapter;
//import graphql.ExceptionWhileDataFetching;
//import graphql.GraphQLError;
//import graphql.servlet.GraphQLErrorHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Configuration
//public class GraphqlConfiguration {
//
//    @Bean
//    public GraphQLErrorHandler errorHandler() {
//        return new GraphQLErrorHandler() {
//            @Override
//            public List<GraphQLError> processErrors(List<GraphQLError> errors) {
//
//                List<GraphQLError> e = new ArrayList();
//
//                return e;
//            }
//
//            protected boolean isClientError(GraphQLError error) {
//                return !(error instanceof ExceptionWhileDataFetching || error instanceof Throwable);
//            }
//        };
//    }
// /**
//  * Resolvers
//  */
//
//}
