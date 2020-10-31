package com.ewit.librarymanagement.libraryweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@ComponentScan
@EnableWebMvc
public class JspViewConfig implements WebMvcConfigurer {

    @Bean
    public UrlBasedViewResolver tilesViewResolver(){
        UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
        tilesViewResolver.setViewClass(TilesView.class);
        return tilesViewResolver;
    }

    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        String [] defs = {
                "/WEB-INF/config/layout.xml",
                "/WEB-INF/config/views.xml"
        };
        tilesConfigurer.setDefinitions(defs);
        return tilesConfigurer;
    }
}
