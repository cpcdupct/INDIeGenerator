package org.xtext.generator

import upctforma.Widget
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import upctforma.ContentElement
import java.util.ArrayList
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text

class TextualDragAndDrop {

	def List<String> generateTextualDragAndDrop(Widget wg, String idgen, String title, List<ContentElement> args, int j, IFileSystemAccess2 fsa, String fileindex, String progresoobj, String filetextualp, Integer tipo,List<String> language){
		var fileindexp = fileindex;
		var progresoobjp = progresoobj;
		var filetextual = filetextualp;		
		var List<String> returnparameter = new ArrayList()
		
		fileindexp=fileindexp + '''
			<div class="row">
				<div class="col-md-12 interview">
					<h4><i class="fa fa-mouse-pointer"></i>&nbsp;«language.get(6)»</h4>
					<i id="objetivo«idgen»" class="far fa-check-square fa-2x" aria-hidden="true"></i>
				</div>
			</div>
		'''
		progresoobjp = progresoobjp + '''
			,"objetivo«idgen»"
		'''

		fileindexp=fileindexp + '''
			<div class="row" style="margin:30px;">
				<div id="drag-options-«idgen»" class="col-md-3 col-sm-3 col-xs-3"></div>
			    <div id="drag-elections-«idgen»" class="col-md-3 col-sm-3 col-xs-3"></div>
			    <div id="drag-descriptions-«idgen»" class="col-md-6 col-sm-6 col-xs-6"></div>
			 </div>
		'''
	
		filetextual=filetextual + '''		 	
		     	var dragDropTerms«idgen» = [
		'''
		
		var ListValue tempwg1;
		if (tipo==1){
			tempwg1= wg.widgetelements.get(0) as ListValue;
		}else{
			val arge = args.get(j) as Widget;			
			tempwg1= arge.widgetelements.get(0) as ListValue;
		}
			
		for (var i = 0; i < tempwg1.listvalues.length; i++){
			val tempwg2 = tempwg1.listvalues.get(i) as RecordValue;
			val tempwg3 = tempwg2.recordvalues.get(0).fieldvalue as Text;
			val tempwg4 = tempwg2.recordvalues.get(1).fieldvalue as Text;
			
			filetextual=filetextual + '''{term: "<p>«tempwg3.html»</p>",definition: "«tempwg4.html»"}''' if (i!=tempwg1.listvalues.length-1){filetextual=filetextual + ''',
			'''}
		}
		filetextual=filetextual + '''];'''
		
		filetextual=filetextual + '''
			DragDropPlugin.createDragDrop('#drag-options-«idgen»', '#drag-elections-«idgen»', '#drag-descriptions-«idgen»',dragDropTerms«idgen»,"objetivo«idgen»","«wg.name»");
		'''
	
		filetextual=filetextual + '''
			getAltura('«idgen»');
		'''
		
		returnparameter.add(fileindexp);
		returnparameter.add(progresoobjp);
		returnparameter.add(filetextual);
		
		
		return returnparameter;	
	}
}