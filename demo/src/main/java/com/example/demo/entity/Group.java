package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee_groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name ="group_code")
    private String groupCode;
    
    @Column(name ="group_name")
    private String groupName;
    
    public Group() {}
    public Group(
    		int id,
            String groupCode,
            String groupName
    ) {
        this.id = id;
        this.groupCode = groupCode;
        this.groupName = groupName;
    }
    /*
    getterとsetterを定義する
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
