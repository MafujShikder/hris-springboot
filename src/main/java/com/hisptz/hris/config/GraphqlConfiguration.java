package com.hisptz.hris.config;

import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import com.hisptz.hris.exception.GraphQLErrorAdapter;
import com.hisptz.hris.resolver.Mutation;
import com.hisptz.hris.resolver.Query;
import com.hisptz.hris.resolver.UserResolver;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.servlet.GraphQLErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public GraphQLErrorHandler errorHandler() {
        return new GraphQLErrorHandler() {
            @Override
            public List<GraphQLError> processErrors(List<GraphQLError> errors) {
                List<GraphQLError> clientErrors = errors.stream()
                        .filter(this::isClientError)
                        .collect(Collectors.toList());

                List<GraphQLError> serverErrors = errors.stream()
                        .filter(e -> !isClientError(e))
                        .map(GraphQLErrorAdapter::new)
                        .collect(Collectors.toList());

                List<GraphQLError> e = new ArrayList<>();
                e.addAll(clientErrors);
                e.addAll(serverErrors);
                return e;
            }

            protected boolean isClientError(GraphQLError error) {
                return !(error instanceof ExceptionWhileDataFetching || error instanceof Throwable);
            }
        };
    }

    @Bean
    public UserResolver userResolver(UserRepository userRepository) {
        return new UserResolver(userRepository);
    }


    @Bean
    public Query query(UserRepository userRepository) {
        return new Query(userRepository);
    }

    @Bean
    public Mutation mutation(UserRepository userRepository){
        return new Mutation(userRepository);
    }

}
