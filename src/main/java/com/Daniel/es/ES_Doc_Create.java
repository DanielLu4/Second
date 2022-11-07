package com.Daniel.es;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.client.indices.CreateIndexRequest;
//import org.elasticsearch.client.indices.CreateIndexResponse;

import java.io.IOException;

public class ES_Doc_Create {
    public static void main(String[] args) throws IOException {
        //创建es客户端
//        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(
//                RestClient.builder(new HttpHost("localhost", 9200, "http")));
//
//        //创建索引
//        CreateIndexResponse response = restHighLevelClient.indices().create(new CreateIndexRequest("skill"), RequestOptions.DEFAULT);
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        Skill skill = new Skill();
//        skill.setName("swimming");
//        skill.setType("sport");
//       mapper.writeValueAsString(skill);
//
//        //相应状态
//        boolean acknowledged = response.isAcknowledged();
//        System.out.println("响应状态"+acknowledged);
//
//        //关闭ES客户端
//        restHighLevelClient.close();

    }
}
