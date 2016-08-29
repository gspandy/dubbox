package com.mbv.open.api.sdk.request.workorder;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.mbv.open.api.sdk.util.JsonUtil;
import com.mbv.open.api.sdk.request.BaseRequest;
import java.lang.String;
import com.mbv.open.api.sdk.response.workorder.WorkOrderSingleQueryResponse;

/**
 * 
 * @author mb.sdk.tool
 *
 */
public class WorkOrderSingleQueryRequest extends BaseRequest<WorkOrderSingleQueryResponse> {

 
	private String workorderId;                 
    

 

  	
	public String getWorkorderId() {
		return workorderId;
	}

	public void setWorkorderId(String workorderId) {
		this.workorderId = workorderId;
	}                
    
	
	@Override
	public String getApiMethod() {
		return "workorder/mb.workorder.single.get";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("workorder_id", this.getWorkorderId());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<WorkOrderSingleQueryResponse> getResponseClass() {
		return WorkOrderSingleQueryResponse.class;
	}

}	