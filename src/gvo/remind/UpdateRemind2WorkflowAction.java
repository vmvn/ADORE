package gvo.remind;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

public class UpdateRemind2WorkflowAction implements Action{

	
	public String execute(RequestInfo info) {
		new BaseBean().writeLog("退回仪器校验更新提醒UpdateRemind2WorkflowAction——————");

		RecordSet rs = new RecordSet();
		RecordSet res = new RecordSet();
		String sql = "";
		String tableName = "";
		String equID = "";
		sql = "Select tablename From Workflow_bill Where id in ("+ "Select formid From workflow_base Where id="+ info.getWorkflowid() + ")";
		new BaseBean().writeLog("sql---------" + sql);
		rs.executeSql(sql);
		if (rs.next()) {
			tableName = Util.null2String(rs.getString("tablename"));
		}

		if (!" ".equals(tableName)) {

			String sql_1 = "select * from " + tableName + " where requestid = "+ info.getRequestid();
			new BaseBean().writeLog("sql_1---------" + sql_1);
			res.executeSql(sql_1);
			if (res.next()) {
				equID = res.getString("yqmc");
				if (!"".equals(equID)) {
					String sql_up = " update formtable_main_258 set yqtgqk = '0' where id = " + equID;
					new BaseBean().writeLog("sql_up---------" + sql_up);

					if (!rs.executeSql(sql_up)) {
						new BaseBean().writeLog("资源状态更新失败");
						return "-1";
					}
				} else {
					new BaseBean().writeLog("资源ID错误");
					return "-1";
				}
			} else {
				new BaseBean().writeLog("流程信息表读取错误");
				return "-1";
			}
		}
		return SUCCESS;
	}
}

