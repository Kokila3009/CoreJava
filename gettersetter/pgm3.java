package com.gentech.gettersetter;

class Hospital3 {
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

    
    class Patient {
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

    
    class Doctor {
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

public class pgm3 {
    public static void main(String[] args) {
        
        Hospital3 hospital = new Hospital3();
        hospital.setHospitalName("Glenegles Hospital");
        hospital.setHospitalNo(585345);

        hospital.showHospitalInfo();
        Hospital3.Patient patient = hospital.new Patient();
        patient.setPatientName("Kokila");
        patient.setPatientId(67890);
        patient.showPatientInfo();
        Hospital3.Doctor doctor = hospital.new Doctor();
        doctor.setDoctorName("Rajesh");
        doctor.setSpecialty("Cardiology");
        doctor.showDoctorInfo();
    }
}
