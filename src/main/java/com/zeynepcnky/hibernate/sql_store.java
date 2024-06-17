package com.zeynepcnky.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


    @Entity
    @Table( name = "customers")

    public class sql_store {
        @Id
        @Column(name = "customer_id")
        private int customer_id;

        @Column (name = "first_name")
        private String first_name;

        @Column (name = "last_name")
        private String last_name;

        @Column (name = "birth_date")
        private String birth_date;

        @Column (name = "city")
        private String city;



        public int getCustomer_id() {
            return customer_id;
        }

        public void setCustomer_id(int customer_id) {
            this.customer_id = customer_id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getBirth_date() {
            return birth_date;
        }

        public void setBirth_date(String birth_date) {
            this.birth_date = birth_date;
        }
    }


