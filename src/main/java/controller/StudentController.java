//package controller;
//
//
//import entity.Student;
//import service.StudentService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class StudentController {
//    private StudentService studentService;
//
//    public StudentController(StudentService studentService){
//        super();
//        this.studentService = studentService;
//    }
//
//    //    handler to list student and return model
//    @GetMapping("/students")
//    public String listStudents(Model model){
//        model.addAttribute("students",studentService.getAllStudents());
//        return "students";
//    }
//
//    @GetMapping("/students/new")
//    public String createStudentForm(Model model){
//        Student student = new Student();
//        model.addAttribute("students",student);
//        return "createStudent";
//
//    }
//}
