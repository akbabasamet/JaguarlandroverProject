package pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JaguarPojo {
    /*
           {
         "id": 0,
         "category": {
           "id": 0,
           "name": "string"
         },
         "name": "doggie",
         "photoUrls": [
           "string"
         ],
         "tags": [
           {
             "id": 0,
             "name": "string"
           }
         ],
         "status": "available"
        }
     */

    private Integer id;
    private JaguarCategoryPojo category;
    private String name;

    public JaguarPojo() {
    }

    public JaguarPojo(Integer id, JaguarCategoryPojo category, String name) {
        this.id = id;
        this.category = category;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JaguarCategoryPojo getCategory() {
        return category;
    }

    public void setCategory(JaguarCategoryPojo category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JaguarPojo{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                '}';
    }
}
