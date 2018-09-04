package com.newcitysoft.study.ajaxdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/4 15:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -7290450079334351660L;
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;
}
