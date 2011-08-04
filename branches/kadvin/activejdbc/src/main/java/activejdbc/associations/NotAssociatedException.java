/*
Copyright 2009-2010 Igor Polevoy 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/


package activejdbc.associations;

import activejdbc.DBException;

/**
 * @author Igor Polevoy
 */
public class NotAssociatedException extends DBException {
    private String message ;

    public NotAssociatedException(String table1, String table2){
        this.message = "No association from table '" + table1 + "' to table '" + table2 +"'";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
