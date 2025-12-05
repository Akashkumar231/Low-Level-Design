package adapter;

interface  IReports{
   String  getJSON_DATA();
}

class XML_ADAPTER implements IReports{

    XML_DATA_PROVIDER xml_data_provider;

    XML_ADAPTER(XML_DATA_PROVIDER xml_data_provider){
        this.xml_data_provider = xml_data_provider;
    }

    @Override
    public String getJSON_DATA() {
      String word =   xml_data_provider.getXML_DATA();
        return word + "data is converted into JSON Data.";
    }
}

class XML_DATA_PROVIDER{

    public String getXML_DATA(){
        return  "XML_DATA is provided";
    }

}

public class AdapterDesignPattern {
    public static void main(String [] args){

      XML_DATA_PROVIDER xml_data_provider = new XML_DATA_PROVIDER();
      XML_ADAPTER xmlAdapter = new XML_ADAPTER(xml_data_provider);
        System.out.println(xmlAdapter.getJSON_DATA());

    }
}
