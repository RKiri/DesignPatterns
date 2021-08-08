package com.weiyuze.dp.cor.servlet.v3;

import java.util.ArrayList;
import java.util.List;

public class Servlet_Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:)，<script>，欢迎访问 weiyuze.com ，大家都是996 ";
        Response response = new Response();
        response.str = "response";

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter());
        chain.add(new SensitiveFilter());
        chain.doFilter(request,response,chain);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}

class Request {
    String str;
}

class Response {
    String str;
}

interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}

class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]");
        chain.doFilter(request, response, chain);
        response.str += "**HTMLFilter";
    }
}

class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("996","955");
        chain.doFilter(request,response,chain);
        response.str +="**SensitiveFilter";
    }
}

class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();
    int index = 0;

    void add(Filter filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) return;
        Filter f = filters.get(index);
        index++;
        f.doFilter(request, response, chain);

    }
}