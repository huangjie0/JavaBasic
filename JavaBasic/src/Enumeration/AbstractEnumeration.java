package Enumeration;
/*
* 抽象枚举
* */

public enum AbstractEnumeration {
    X(){
        @Override
        public void go(){

        }
    },
    Y("黄杰"){
        @Override
        public void go(){
            System.out.println(getName() + "在跑步！！！");
        }
    };
    public abstract void go();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    AbstractEnumeration() {
    }

    AbstractEnumeration(String name) {
        this.name = name;
    }
}
