package TRY.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    gotoGroupePage("groups");
    selectGroup("selected[]");
    deleteSelectedGroups("delete");
    returnToGroupPage("group page");
    }

}

