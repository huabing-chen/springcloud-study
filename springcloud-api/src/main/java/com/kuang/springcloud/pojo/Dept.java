package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: Ra
 * @Data: 2022/12/4 - 21:54
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable {

    private Long deptno;
    private String dname;

    //这个数据存在于那个数据库的字段~
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /**
     链式写法
        Dept dept = new Dept();

        dept.setDeptNo(11).setDname('sss").setDbSource("db01");
     */
}
