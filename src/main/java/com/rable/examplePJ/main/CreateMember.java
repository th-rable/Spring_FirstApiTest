package com.rable.examplePJ.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateMember {
    public CreateMember(){
        System.out.println("Run CreateMember");
        count.put("Count",0);
        members.add(count);
    }
    private int memberId = 0;

    private Map<String,Object> count = new HashMap<>();
    private List<Map<String,Object>> members = new ArrayList<>();
    public void create(){
        this.memberId++;

        Map<String,Object> member = new HashMap<>();

        count.put("Count",memberId);

        member.put("ID",this.memberId);
        member.put("Name",this.memberId + "번 유저");

        members.set(0,count);
        members.add(member);

        System.out.println("Create Members");
        return;
    }

    public List<Map<String,Object>> getMembers(){
        System.out.println("Get Members");
        return members;
    }

    public Map<String, Object> getCount() {
        return count;
    }
}
