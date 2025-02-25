package dao;

import models.Patient;

import java.util.List;
import java.util.Map;

public interface PatientDao {
    String add(Long hospitalId, Patient patient);

    String updateById(Long id, Patient patient);

    String addPatientsToHospital(Long id, List<Patient> patients);
    Patient getPatientById(Long id);
    Map<Integer, Patient> getPatientByAge();
    List<Patient> sortPatientsByAge(String ascOrDesc);

    void removeById(Long id);
}
