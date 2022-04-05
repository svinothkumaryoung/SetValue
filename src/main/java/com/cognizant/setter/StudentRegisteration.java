package com.cognizant.setter;

public class StudentRegisteration {
    private String username;
    private int registerNo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public void printdata()
    {
        System.out.println("Student Name is "+getUsername()+" Register Number "+getRegisterNo());
    }
}

