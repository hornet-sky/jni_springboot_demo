package my;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JniDemo2Application {

	public static void main(String[] args) {
	    try {
            NativeLoader.loader("native"); // 加载本地库
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
		SpringApplication.run(JniDemo2Application.class, args);
	}

}
