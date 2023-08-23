package com.epc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class EPCApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(EPCApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  EPC启动成功   ლ(´ڡ`ლ)ﾞ \n " +
                "_______           ________        ________     \n" +
                "|\\  ___ \\         |\\   __  \\      |\\   ____\\    \n" +
                "\\ \\   __/|        \\ \\  \\|\\  \\     \\ \\  \\___|    \n" +
                " \\ \\  \\_|/__       \\ \\   ____\\     \\ \\  \\       \n" +
                "  \\ \\  \\_|\\ \\       \\ \\  \\___|      \\ \\  \\____  \n" +
                "   \\ \\_______\\       \\ \\__\\          \\ \\_______\\\n" +
                "    \\|_______|        \\|__|           \\|_______|" );
    }
}
