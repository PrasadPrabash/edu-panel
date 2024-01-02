package lk.ijse.dep11.edupanel.to.request;

import lk.ijse.dep11.edupanel.util.LecturerType;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class LectureReqTO implements Serializable {
    private String name;
    private String designation;
    private String qualifications;

    private LecturerType type;
    private Integer displayOrder;
    private MultipartFile picture;
    private String linkedin;


}
