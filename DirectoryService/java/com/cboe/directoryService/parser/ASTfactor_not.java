/* Generated By:JJTree: Do not edit this line. ASTfactor_not.java */

package com.cboe.directoryService.parser;

public class ASTfactor_not extends SimpleNode {
  private int notCount;
  public ASTfactor_not(int id) {
    super(id);
  }

  public ASTfactor_not(DirectoryServiceParser p, int id) {
    super(p, id);
  }
    

  /** Accept the visitor. **/
  public Object jjtAccept(DirectoryServiceParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }

    public void incrementNotCount() {
	notCount++;
    }
    
    public int getNotCount() {
	return notCount;
    }
    public boolean equals(Object obj) {
	if(!(obj instanceof ASTfactor_not)) {
	    return false;
	}
	if (getNotCount() != ((ASTfactor_not)obj).getNotCount()) {
	    return false;
	}
	  
	if(jjtGetNumChildren() == ((Node)obj).jjtGetNumChildren()) {
	    for(int i = 0; i < jjtGetNumChildren(); i++) {
		if(jjtGetChild(i).equals(((Node)obj).jjtGetChild(i)) == false) {
		    return false;
		}
	    }
	} else {
	    return false;
	}
	return true;
    }
}


