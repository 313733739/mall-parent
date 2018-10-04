package com.marshal.pojoext;

import com.marshal.pojo.TbSpecification;
import com.marshal.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

public class Specification implements Serializable {

    private TbSpecification tbSpecification;

    private List<TbSpecificationOption> rows;

    public Specification() {
    }

    public Specification(TbSpecification tbSpecification, List<TbSpecificationOption> rows) {
        this.tbSpecification = tbSpecification;
        this.rows = rows;
    }

    public TbSpecification getTbSpecification() {
        return tbSpecification;
    }

    public void setTbSpecification(TbSpecification tbSpecification) {
        this.tbSpecification = tbSpecification;
    }

    public List<TbSpecificationOption> getRows() {
        return rows;
    }

    public void setRows(List<TbSpecificationOption> rows) {
        this.rows = rows;
    }
}
