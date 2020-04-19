package emp.dao;

import java.util.List;

import emp.domain.EmpInfo;

public interface EmpInfoDAO
{
	public void saveEmpInfo(EmpInfo empInfo);

	public List<EmpInfo> getEmpInfoList();
}
