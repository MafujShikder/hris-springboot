package com.hisptz.hris.config;

import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldBundle.FieldResolver;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupResolver;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetRepository;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetResolver;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionResolver;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupRepository;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupResolver;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetRepository;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetResolver;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import com.hisptz.hris.exception.GraphQLErrorAdapter;
import com.hisptz.hris.resolver.Mutation;
import com.hisptz.hris.resolver.Query;
import com.hisptz.hris.Bundles.UserBundle.UserResolver;
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
    public FieldResolver fieldResolver(FieldRepository fieldRepository){
        return new FieldResolver(fieldRepository);
    }

    @Bean
    public FieldOptionResolver fieldOptionResolver(FieldOptionRepository fieldOptionRepository){
        return new FieldOptionResolver(fieldOptionRepository);
    }

    @Bean
    public FieldGroupResolver fieldGroupResolver(FieldGroupRepository fieldGroupRepository){
        return new FieldGroupResolver(fieldGroupRepository);
    }

    @Bean
    public FieldGroupSetResolver fieldGroupSetResolver(FieldGroupSetRepository fieldGroupSetRepository){
        return new FieldGroupSetResolver(fieldGroupSetRepository);
    }

    @Bean
    public FieldOptionGroupResolver fieldOptionGroupResolver(FieldOptionGroupRepository fieldOptionGroupRepository){
        return new FieldOptionGroupResolver(fieldOptionGroupRepository);
    }

    @Bean
    public FieldOptionGroupSetResolver fieldOptionGroupSetResolver(FieldOptionGroupSetRepository fieldOptionGroupSetRepository){
        return new FieldOptionGroupSetResolver(fieldOptionGroupSetRepository);
    }
    @Bean
    public Query query(UserRepository userRepository, FieldRepository fieldRepository,FieldOptionRepository fieldOptionRepository,FieldGroupRepository fieldGroupRepository,FieldGroupSetRepository fieldGroupSetRepository, FieldOptionGroupRepository fieldOptionGroupRepository,FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        return new Query(userRepository, fieldRepository, fieldOptionRepository, fieldGroupRepository,fieldGroupSetRepository,fieldOptionGroupRepository,fieldOptionGroupSetRepository);
    }

    @Bean
    public Mutation mutation(UserRepository userRepository, FieldRepository fieldRepository, FieldOptionRepository fieldOptionRepository,FieldGroupRepository fieldGroupRepository ,FieldGroupSetRepository fieldGroupSetRepository, FieldOptionGroupRepository fieldOptionGroupRepository,FieldOptionGroupSetRepository fieldOptionGroupSetRepository){
        return new Mutation(userRepository, fieldRepository, fieldOptionRepository, fieldGroupRepository,fieldGroupSetRepository, fieldOptionGroupRepository,fieldOptionGroupSetRepository);
    }

}
