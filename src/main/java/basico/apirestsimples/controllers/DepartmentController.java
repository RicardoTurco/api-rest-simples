package basico.apirestsimples.controllers;

import basico.apirestsimples.entities.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @GetMapping
    public List<Department> getObjects() {

        Department d1 = new Department(1L, "Tech");
        Department d2 = new Department(2L, "Pet");

        List<Department> list = Arrays.asList(d1, d2);

        return list;
    }

}
