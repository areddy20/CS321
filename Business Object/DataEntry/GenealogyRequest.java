import java.util.ArrayList;
import java.util.List;
public class GenealogyRequest{
    private int requestID;
    private Citizen requester;
    private List<Form> requestedForms;
    private String status;

    public GenealogyRequest(int requestID, Citizen requester, List<Form> requestedForms, String status){
        this.requestID=requestID;
        this.requester=requester;
        this.requestedForms=requestedForms;
        this.status=status;
    }
    public void createRequest(){
        WorkFlowTable newWF = new WorkFlowTable(requestID, 1);
    }
    public int getrequestID(){
        return requestID;
    }
    public Citizen getRequester(){
        return requester;
    }
    public List<Form> getForms(){
        return requestedForms;
    }
    public String getStatus(){
        return status;
    }


}