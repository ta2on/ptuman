package test.sample.service;

import java.util.List;
import java.util.Map;
 
import javax.annotation.Resource;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import test.sample.dao.SampleDAO;
 
@Service("sampleService")
public class SampleServiceImpl implements SampleService{
    Logger log = Logger.getLogger(this.getClass());
     
    @Resource(name="sampleDAO")
    private SampleDAO sampleDAO;
     
    @Override
    public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
        return sampleDAO.selectBoardList(map);
    }

    @Override
    public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception {
        sampleDAO.updateHitCnt(map);
        Map<String, Object> resultMap = sampleDAO.selectBoardDetail(map);
        return resultMap;
    }

	@Override
	public void insertBoard(Map<String, Object> map) throws Exception {
		 sampleDAO.insertBoard(map);
	}

	@Override
	public void updateBoard(Map<String, Object> map) throws Exception {
		sampleDAO.updateBoard(map);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		sampleDAO.deleteBoard(map);
		
	}

 
}

