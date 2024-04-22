package org.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    @RequestMapping("/getDetails")
    public String getCustomerDetails(@RequestParam("customerId") int customerId,
                                     @RequestParam("customerName") String customerName,
                                     @RequestParam("monthlyIncome") double monthlyIncome,
                                     @RequestParam("profession") String profession,
                                     @RequestParam("designation") String designation,
                                     @RequestParam("companyName") String companyName,
                                     ModelMap modelMap)
    {
        modelMap.put("customerId" , customerId);
        modelMap.put("customerName" , customerName);
        modelMap.put("monthlyIncome" , monthlyIncome);
        modelMap.put("profession" , profession);
        modelMap.put("designation" , designation);
        modelMap.put("companyName" , companyName);

        return "success.jsp";
    }

}
