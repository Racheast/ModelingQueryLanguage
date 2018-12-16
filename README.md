# ModelingQueryLanguage

Tested with Eclipse DSL IDE 2018-09

Please follow the following steps to set the application up in your Eclipse IDE and to run some queries:

0. Install the XText Plugin from the Eclipse Marketplace.

1. Install the VIATRA plugin (tested with version 2.0.3) from the Eclipse Marketplace.

2. Import all projects into Eclipse.

3. Right-mouse-click on the project org.xtext.MQL -> run as -> Eclipse Application
In case of errors on Application startup please follow the following steps:
3.0 Right-mouse-click on the project org.xtext.MQL -> run as -> Run Configuration...
3.1 In the "Main" Tab make sure that "Location" is set to "${workspace_loc:org.xtext.MQL.ui}/runtime/"
3.2 In the "Plug-Ins" tab click on "Add Required Plugins" to add all plugin-dependencies that are needed to run this project.
3.3	In the "Plug-ins" tab click on "Validate Plug-Ins" to make sure that there are no errors about missing plugin-dependencies.
3.4 Click on "Apply"
3.5 Click on "Run"

4. In the new Eclipse Runtime Window create a new project called "MQLRuntime" if it doesn't already exists.

5. Right-mouse-click on the project MQLRuntime -> new -> File -> create a file with the ending ".mql", e.g. "query.mql"

6. Confirm the dialog to convert the project MQLRuntime to an XText project.

7. The window "MQL Editor" opens with the two tabs "Query Definition" and "Query Execution, Results"

8 Enter a new mql Query in the "Query Definition" tab and save it. 
ATTENTION: Due to eclipse-related bugs errors can occur during the saving of the .mql file. You will notice some exception-stack traces in the console of your original Eclipse Instance.
Please save the file again and again until the console says "MQLGenerator: Generation of Query.vql completed."

9. Select a caex model (*.xmi file) in the "Query Execution, Results" tab by clicking on "Select Domain Model". The button "Execute Query" will be enabled.
ATTENTION: Please select only models that do not refer to other external *.xmi files.

10. Click on "Execute Query" to execute the mql query. Results will be listed on the screen "MQL Query Results" above.

Follow steps 8, 9 (optional if button "Execute Query" already enabled) and 10 to define and execute queries.
