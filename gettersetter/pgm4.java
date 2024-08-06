package com.gentech.gettersetter;


class Hospital4 {
    String hospitalName;
    int hospitalNo;

    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

   
    public int getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(int hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    
    void showHospitalInfo() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Number: " + hospitalNo);
    }

    
    static class Patient {
        private String patientName;
        private int patientId;

        
        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

       
        public int getPatientId() {
            return patientId;
        }

        public void setPatientId(int patientId) {
            this.patientId = patientId;
        }

        
        void showPatientInfo() {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient ID: " + patientId);
        }
    }

    
    static class Doctor {
        private String doctorName;
        private String specialty;

     
        public String getDoctorName() {
            return doctorName;
        }

        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }

     
        public String getSpecialty() {
            return specialty;
        }

        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

       
        void showDoctorInfo() {
            System.out.println("Doctor Name: " + doctorName);
            System.out.println("Specialty: " + specialty);
        }
    }
}

public class pgm4 {
    public static void main(String[] args) {
        
        Hospital4 hospital = new Hospital4();
        hospital.setHospitalName("BGS Hospital");
        hospital.setHospitalNo(12345);
        hospital.showHospitalInfo();
        Hospital4.Patient patient = new Hospital4.Patient();
        patient.setPatientName("Ravindra");
        patient.setPatientId(67890);
        patient.showPatientInfo();
        Hospital4.Doctor doctor = new Hospital4.Doctor();
        doctor.setDoctorName("Smitha");
        doctor.setSpecialty("Cardiology");
        doctor.showDoctorInfo();
    }
}