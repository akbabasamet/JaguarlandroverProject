package pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JaguarCategoryPojo {
    /*
    category": {
           "id": 0,
           "name": "string"
         },
     */

    private String name;

    public JaguarCategoryPojo() {
    }

    public JaguarCategoryPojo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JaguarCategoryPojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
