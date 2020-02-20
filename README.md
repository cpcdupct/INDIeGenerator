# INDIeGenerator v.1.3.0

![logoIndie](http://indie.upct.es/images/logos/indie_vertical_ColorOscuro_small.png)

### What is INDIeGenerator?

INDIeGenerator is a code generator that transforms the content, assessment, sequencing and gamification models implemented with INDIeAuthor 
(JSON script) into code part of the implementation of the course (e.g. HTML5 and JavaScript code). More information can be found in the 
following paper: [INDIeAuthor: A Metamodel-Based Textual Language for Authoring Educational Courses](https://ieeexplore.ieee.org/document/8693779).

### The project

Two Eclipse Modeling Framework and two Xtext Project can be find inside the INDIeGenerator repository.

#### Eclipse Modeling Framework Projects
The metamodel for content and assessment DSL are included in these projects.

1) Content DSL metamodel (upctforma): In the following figure you can see the metamodel defined for the Content DSL.

![Content DSL metamodel](http://indie.upct.es/indiegenerator/upctforma.jpg)

2) Evaluation DSL metamodel (upctformaevalua): In the following figure you can see the metamodel defined for Assessment DSL.

![Evaluation DSL metamodel](http://indie.upct.es/indiegenerator/upctformaevalua.jpg)

#### Xtext Projects

A grammar and a DSL engine have been defined for each INDIeAuthor DSL.

1) Upctforma Project: The grammar can be found in the Upctforma.xtext and the code generator can be found in the UpctformaGenerator.xtend file. 
An excerpt of these files is shown bellow:

```html
ContentUnit returns ContentUnit:
	'Unit'
	name=EString
	author=EString
	type=ContentUnitType
	language = LanguageType
	'{'
		sections+=Section ( "," sections+=Section)*
	'}';

Type_Impl returns Type:
	{Type}
	'Type'
	name=EString;

Row returns Row:
	{Row}
	'row'
	'{'
		(columns+=Column ( "," columns+=Column)* )?
		('usetemplate' usetemplate=UseTemplate)?
	'}';
```
Upctforma.xtext excerpt

```html
def generateImageTextOver(Widget wg, String idgen){
		val tempwg1= wg.widgetelements.get(0) as Image;
		val tempwg2= wg.widgetelements.get(1) as Text;	
		fileindex = fileindex + '''			
			<div class="row">
				<div class="col-md-12 interview">
					<h4><i class="fa fa-mouse-pointer"></i>&nbsp;«language.get(9)» </h4>
					<i id="objetivo«idgen»" class="far fa-check-square fa-2x" aria-hidden="true"></i>
				</div>
			</div>
			<div class="grid mask">
				<figure class="text">
					<img id="«idgen»" data-type="ImageTextOver" data-desc="«wg.name»" class="img-responsive mano btnmostrar control_objetivo_unico_click" title="Imagen" alt="figcaption" src="«tempwg1.url»">
				    	<figcaption>
				    		«tempwg2.html»
				    		
				        </figcaption>
				</figure>
			</div>		
		'''
		
		progresoobj = progresoobj + '''
			,"objetivo«idgen»"
		'''
		
	}
```
UpctformaGenerator.xtend excerpt



2) upctformaevalua project: The grammar can be found in the Upctformaevalua.xtext and the code generator can be found in the UpctformaevaluaGenerator.xtend file
An excerpt of these files is shown bellow:

```html
EvaluationUnit_Impl returns EvaluationUnit:
	{EvaluationUnit}
	'EvaluationUnit'
	name=EString
	language = EvaluationLanguageType
	'{'
		('numberquestions' numberquestions=EInt)?
		('questions' '{' questions+=Question ( "," questions+=Question)* '}' )?
	'}';

Question_Impl returns Question:
	{Question}
	'Question'
	'{'
		('correctfeedback' correctfeedback=EString)?
		('incorrectfeedback' incorrectfeedback=EString)?
	'}';

EInt returns ecore::EInt:
	'-'? INT;

Training returns Training:
	{Training}
	'Training'
	name=EString
	language = EvaluationLanguageType
	'{'
		('numberquestions' numberquestions=EInt)?
		('Attempts' Attempts=EInt)?
		('grade' grade=TypeGrade)?
		('questions' '{' questions+=Question ( "," questions+=Question)* '}' )?
	'}';
```
Upctformaevalua.xtext excerpt

```html
		var contadorpreguntas = 0;
		for (var x = 0; x < eu.questions.length; x++){			
			var q = eu.questions.get(x);
				
			if (q instanceof SingleAnswer){
				contadorpreguntas++;
				filejs = filejs +'''				
					tipoPreguntas[«contadorpreguntas»] = 0;	
					enunciados[«contadorpreguntas»] = new Array();
					enunciados[«contadorpreguntas»].push('«q.statements.text»');
					respuestas[«contadorpreguntas»] = new Array();
					respuestascorrectas[«contadorpreguntas»] = new Array();
					respuestascorrectas[«contadorpreguntas»].push(«q.correctanswer»);
					respuestasEstudiante[«contadorpreguntas»] = new Array();
				''';	
				fileindex = fileindex + '''
					<div class="col-md-6 col-sm-12 col-xs-12"">
    					<div class="list-group" data-value="«contadorpreguntas»">
					        <p class="list-group-item-heading" id="enunciado«contadorpreguntas»" data-value="«contadorpreguntas»" >«q.statements.text»</br><span class="tipoPregunta"> «language.get(1)»</span></p>
				'''.toString();
```
UpctformaevaluaGenerator.xtend excerpt

## Creators and contributors
INDIeAuthor has been created at the **Digital Content Creation Center** (CPCD), in the Universidad Politécnica de Cartagena.

## License
Apache License 2.0
