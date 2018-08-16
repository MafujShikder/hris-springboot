//package com.hisptz.hris.config;
//
//import com.hisptz.hris.Bundles.UserBundle.UserResolver;
//import graphql.GraphQL;
//import graphql.schema.GraphQLSchema;
//import graphql.schema.idl.RuntimeWiring;
//import graphql.schema.idl.SchemaGenerator;
//import graphql.schema.idl.SchemaParser;
//import graphql.schema.idl.TypeDefinitionRegistry;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.io.File;
//import java.io.IOException;
//
///**
// * Created by Guest on 8/15/18.
// */
//@Service
//public class GraphQLService {
//    @Autowired
//    private UserResolver userResolver;
//
//    private GraphQL graphQL;
//
//    @PostConstruct
//    private void loadSchema() throws IOException {
//
//        // get the schema
//        File schemaFile = resource.getFile();
//        // parse schema
//        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemaFile);
//        RuntimeWiring wiring = buildRuntimeWiring();
//        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);
//        graphQL = GraphQL.newGraphQL(schema).build();
//    }
//
//    private RuntimeWiring buildRuntimeWiring() {
//        return RuntimeWiring.newRuntimeWiring()
//                .type("Query", typeWiring -> typeWiring
//                        .typeName("User")
//                .build();
//    }
//
//
//    public GraphQL getGraphQL() {
//        return graphQL;
//    }
//}
