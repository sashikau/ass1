package com.cmb.model;

import java.util.ArrayList;
import java.util.List;

public class PatientTableModel {

    private List<PatientData> dataList;
    private List<PatientData> filteredDataList;

    private void addData(PatientData patientData){

        if(dataList!=null){
            dataList = new ArrayList<PatientData>();
        }

        dataList.add(patientData);
    }

    public List<PatientData> getDataList() {
        return dataList;
    }

    public void setDataList(List<PatientData> dataList) {
        this.dataList = dataList;
    }

    public List<PatientData> getFilteredDataList() {
        return filteredDataList;
    }

    public void setFilteredDataList(List<PatientData> filteredDataList) {
        this.filteredDataList = filteredDataList;
    }
}
