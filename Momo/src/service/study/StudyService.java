
package service.study;

import java.util.List;
import dto.Study;
import dto.StudyCategory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.study.StudyDaoImpl;
import dto.FileUpload;


public interface StudyService {

	public List<StudyCategory> getCategory();

	public List<Study> getMyStudy(int u_no);

	public List<Study> getHurryStudy();

	public List<Study> getCateStudyList(int category_code);
  
  	// 희경 start --------------------------
	
	//요청파라미터 처리
	public Study getParam(HttpServletRequest req, HttpServletResponse resp);

	//스터디 개설(등록)
	public Study studyopen(Study study);

	//첨부파일이 있을경우 파일 업데이트
	public void updateFile(FileUpload fileupload);

	//스터디 번호 가져오기
	public int getStudy_no();

	//스터디 카테고리 가져옴
	//public int getCategory();
		
	//스터디 세부카테고리()
	//public List getList();
	
	//희경 end-----------------------------
}

