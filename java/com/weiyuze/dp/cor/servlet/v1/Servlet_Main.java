package com.weiyuze.dp.cor.servlet.v1;

import java.util.ArrayList;
import java.util.List;

public class Servlet_Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:)，<script>，欢迎访问 weiyuze.com ，大家都是996 ";
        Response response = new Response();
        response.str = "";

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter());
        chain.add(new SensitiveFilter());
        chain.doFilter(request, response);
        System.out.println(request.str);
    }
}

class Request {
    String str;
}

class Response {
    String str;
}

interface Filter {
    void doFilter(Request request, Response response);
}

class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]");
    }
}

class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("996", "955");
    }
}

class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    void add(Filter filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response) {
        for (Filter f : filters) {
            f.doFilter(request, response);
        }
    }
}
