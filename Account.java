package Execeptions;

import javax.imageio.IIOException;
import java.io.IOException;

public class Account {
    private float balance=5;
     public void deposit(float value) throws IOException {
         if(value<=0)
             throw new IOException();
     }

     public void withdraw(float amount) throws AccountException {

         if(amount>balance) {
             throw new AccountException(new InsuffientFundsExceptions());
         }



}}
//    var accountException= new AccountException();
//    var insuffientFundsException= new InsuffientFundsExceptions();
//         accountException.initCause(insuffientFundsException);
//                 throw accountException;
