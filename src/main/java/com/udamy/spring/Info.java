package com.udamy.spring;

public class Info {
        private String street;
        private String postalCode;
        public Info(String street, String postalCode){
            this.street = street;
            this.postalCode = postalCode;
        }
        @Override
        public String toString(){
            return "Street " + street + " Postal Code : "+postalCode;
        }
}
