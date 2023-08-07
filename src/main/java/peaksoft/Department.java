package peaksoft;

import java.util.List;

public class Department {
    private String name;
    private String description;

    private List<DepartmentService> departmentService;

    public Department() {
    }

    public Department(String name, String description, List<DepartmentService> departmentService) {
        this.name = name;
        this.description = description;
        this.departmentService = departmentService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DepartmentService> getDepartmentService() {
        return departmentService;
    }

    public void setDepartmentService(List<DepartmentService> departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", departmentService=" + departmentService +
                '}';
    }
}
