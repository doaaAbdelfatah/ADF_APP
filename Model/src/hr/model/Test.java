package hr.model;

import hr.model.vo.RegionsViewImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.*;
import oracle.jbo.client.Configuration;
import oracle.jbo.domain.Number;

public class Test {
    public static void main(String[] args) {
    
        
        ADFContext oldContext = ADFContext.initADFContext(null, null, null, null);
        try {
            String amDef = "hr.model.AppModule";
            String config = "AppModuleLocal";
            ApplicationModule am = Configuration.createRootApplicationModule(amDef, config);
           // ViewObject vo = am.findViewObject("RegionsView");
            
            // Work with your appmodule and view object here
          //  Configuration.releaseRootApplicationModule(am, true);
        } finally {
            ADFContext.resetADFContext(oldContext);
        }
    }
}
