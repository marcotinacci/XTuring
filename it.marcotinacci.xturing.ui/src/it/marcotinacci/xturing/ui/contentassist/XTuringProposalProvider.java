/*
* generated by Xtext
*/
package it.marcotinacci.xturing.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import it.marcotinacci.xturing.ui.contentassist.AbstractXTuringProposalProvider;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class XTuringProposalProvider extends AbstractXTuringProposalProvider {

	@Override
	public void complete_Machine(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.complete_Machine(model, ruleCall, context, acceptor);
	}
}
