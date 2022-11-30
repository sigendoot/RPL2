package com.toko.bunga.app;

import com.toko.bunga.service.TokoBungaService;
import com.toko.bunga.view.TokoBungaView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Asep Hikmat
 */
public class TokoBungaApp {
    private static ApplicationContext appContext;
    
    public static void main(String[] args){
        appContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        new TokoBungaView().setVisible(true);
    }
    
    public static TokoBungaService getTokoBungaService(){
        return (TokoBungaService)appContext.getBean("TokoBungaService");
    }
}
