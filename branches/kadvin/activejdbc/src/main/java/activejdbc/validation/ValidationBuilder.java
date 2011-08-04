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


package activejdbc.validation;

import activejdbc.validation.Validator;

import java.util.List;

public class ValidationBuilder<T extends Validator> {

    protected List<T> validators;

    public ValidationBuilder(List<T> validators){
        this.validators = validators;
    }

    //TODO implement resource bundles here so that the argument cam be either literal string or key to the message
    public void message(String message){
        for (T validator : validators) {
            validator.setMessage(message);
        }
    }
}
