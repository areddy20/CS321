import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class GeneaologyRequestApprovalTest {

    @Test
    public void FindFormsByIdsShould_ReturnNull_When_ProvidedAnyNegativeId() {
        GeneaologyRequestApproval request = new GeneaologyRequestApproval();
        assertNull(request.findFormsByIds(List.of(1, -1)));
    }
    
    @Test
    public void FindImmigrantByIdShould_ReturnNull_When_ProvidedNegativeId() {
        GeneaologyRequestApproval request = new GeneaologyRequestApproval();
        assertNull(request.findImmigrantById(-1));
    }

    @Test 
    public void SubmitRequestShould_ChangeStatusToSubmitted_When_Called() {
        GeneaologyRequestApproval request = new GeneaologyRequestApproval();
        request.submitRequest();
        assertTrue(request.getStatus().equals("Submitted"));
    }

    @Test 
    public void CancelRequestShould_ChangeStatusToCanceled_When_Called() {
        GeneaologyRequestApproval request = new GeneaologyRequestApproval();
        request.cancelRequest();
        assertTrue(request.getStatus().equals("Canceled"));
    }
}
