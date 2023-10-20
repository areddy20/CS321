import java.util.List;

public class GeneaologyRequestApproval {
        private int requestId;
        // private Citizen requester; 
        private List<Form> requestedForms;
        private String status;
        private int immigrantId;
        
        public GeneaologyRequestApproval(int requestId, List<Form> requestedForms, String status, int immigrantId) {
            this.requestId = requestId;
            this.requestedForms = requestedForms;
            this.status = status;
            this.immigrantId = immigrantId;
        }
        public int getRequestId() {
            return requestId;
        }
        public void setRequestId(int requestId) {
            this.requestId = requestId;
        }
        public List<Form> getRequestedForms() {
            return requestedForms;
        }
        public void setRequestedForms(List<Form> requestedForms) {
            this.requestedForms = requestedForms;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        public int getImmigrantId() {
            return immigrantId;
        }
        public void setImmigrantId(int immigrantId) {
            this.immigrantId = immigrantId;
        }

}
