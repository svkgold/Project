package DEV_110_2_1;

public class Teachers {

    private String name;
    private String sex;
    private String faculty;
    private String academicDegree;
    private String specialization;

    public Teachers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", faculty='" + faculty + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
