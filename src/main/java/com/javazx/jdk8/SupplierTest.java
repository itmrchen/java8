package com.javazx.jdk8;

import java.util.function.Supplier;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/10 1:58
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello javazx";
        System.out.println(supplier.get());

        //Supplier<SupplierStudentPo> supplierStudentPoSupplier = () -> new SupplierStudentPo();
        Supplier<SupplierStudentPo> supplierStudentPoSupplier = SupplierStudentPo::new;
        System.out.println(supplierStudentPoSupplier.get().getUserName());
    }


}
