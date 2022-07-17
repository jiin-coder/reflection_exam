package com.ll.exam.ropository;

public class UserRepository {
    private String[] data = {
            "Jay","Lee","Kim","Choi","Park","Yoon"
    };

    public String[] getAll() {
        return data.clone();
    }
}
