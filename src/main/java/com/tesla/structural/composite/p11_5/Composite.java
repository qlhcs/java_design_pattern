package com.tesla.structural.composite.p11_5;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    private List<Component> childrenList;

    @Override
    public void operation() {
        childrenList.forEach(Component::operation);
    }

    public Composite() {
        childrenList = new ArrayList<>();
    }

    public void setChildrenList(List<Component> childrenList) {
        this.childrenList = childrenList;
    }


}
