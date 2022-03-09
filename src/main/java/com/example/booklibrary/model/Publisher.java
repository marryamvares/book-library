package com.example.booklibrary.model;
import javax.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {
    private Integer idpublisher;
    private String publishername;
    private String mobile_no;


    public Publisher() {
    }

    public Publisher(Integer idpublisher, String publishername, String mobile_no) {
        this.idpublisher = idpublisher;
        this.publishername = publishername;
        this.mobile_no = mobile_no;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIdpublisher() {
        return idpublisher;
    }

    public void setIdpublisher(Integer idpublisher) {
        this.idpublisher = idpublisher;
    }

    @Column
    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    @Column
    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}