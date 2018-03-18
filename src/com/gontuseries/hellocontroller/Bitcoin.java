package com.gontuseries.hellocontroller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Bitcoin extends Coin{

    @RequestMapping("/BITCOIN")
    @ResponseBody
    public String BTC() throws Exception,ClassNotFoundException, SQLException{
        String QUERY="SELECT * FROM BITCOIN";
        DAO dao=new DAO();
        double price;
        price = dao.ExecSingleResultSelQuery(QUERY).getFloat("PRICE");
        return Double.toString(price);
    }
    @RequestMapping("/DOGECOIN")
    @ResponseBody
    public String DOGE() throws Exception,ClassNotFoundException, SQLException{
        String QUERY="SELECT * FROM DOGECOIN";
        DAO dao=new DAO();
        float price;
        price = dao.ExecSingleResultSelQuery(QUERY).getFloat("PRICE");
        return Float.toString(price);
    }
    @RequestMapping("/ETHEREUMCOIN")
    @ResponseBody
    public String ETH() throws Exception,ClassNotFoundException, SQLException{
        String QUERY="SELECT * FROM ETHEREUMCOIN";
        DAO dao=new DAO();
        float price;
        price = dao.ExecSingleResultSelQuery(QUERY).getFloat("PRICE");
        return Float.toString(price);
    }
    @RequestMapping("/LITECOIN")
    @ResponseBody
    public String LTC() throws Exception,ClassNotFoundException, SQLException{
        String QUERY="SELECT * FROM LITECOIN";
        DAO dao=new DAO();
        float price;
        price = dao.ExecSingleResultSelQuery(QUERY).getFloat("PRICE");
        return Float.toString(price);
    }


}


