package springmybatis.model;

import springmybatis.myenum.StateEnum;

public class City {
    private Long id;

    private String name;

    private StateEnum state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "id:" + id + ";name:" + name + ";state:" + state;
    }
}