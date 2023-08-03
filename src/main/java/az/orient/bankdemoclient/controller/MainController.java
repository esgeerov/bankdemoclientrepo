package az.orient.bankdemoclient.controller;

import az.orient.bankdemoclient.util.Utility;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final Utility utility;
    @GetMapping("/GetAccountList")
    public void getAccountlist(){
        System.out.println(utility.sendGet("http://localhost:8088/bank/account/GetAccountListByCustomerId/1"));

    }
    @GetMapping("/GetCustomerList")
    public void getCustomerList(){


    }
}
