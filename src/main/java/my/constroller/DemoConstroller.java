package my.constroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.DoSomething;

@RestController
@RequestMapping("/demo")
public class DemoConstroller {
    @RequestMapping()
    public String foo(String username) {
        System.out.println("username = " + username);
        DoSomething ds = new DoSomething();
        String r = ds.sayHelloTo(username);
        return "{\"code\":200,\"message\":\"success\",\"data\":\"" + r + "\"}";
    }
}
