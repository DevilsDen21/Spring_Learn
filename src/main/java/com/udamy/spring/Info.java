package com.udamy.spring;

import java.util.List;

public class Info {
        private String street;
        private String postalCode;
        private List<String> familyMembers;
        public Info(String street, String postalCode,List<String> familyMembers){
        this.street = street;
        this.postalCode = postalCode;
        this.familyMembers = familyMembers;
         }
        public Info(String street, String postalCode){
            this.street = street;
            this.postalCode = postalCode;
        }

        @Override
        public String toString(){
            return "Street " + street + " Postal Code : "+postalCode + " family members include "+ familyMembers.toString();
        }
}
