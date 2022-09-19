public class ToString {  

    public static String toString(Object object){

        Field []fields = object.getClass().getDeclaredFields();


        String str = "{";


        for(Field field : fields){

            field.setAccessible(true);

   

            try {

                String type =               

                    field.getType().toString().

                    substring(field.getType().toString().lastIndexOf(".") + 1);



                if(field.getType().toString().startsWith("class ") &&           

                   !field.getType().toString().startsWith("class java.lang.")){



                   str += type + " " + field.getName() + 

                          toString(field.get(object)) + " ";

                }

                else{

                   str += type + " " + field.getName() + ":" + 

                          field.get(object) + " ";   

                }

            } catch (IllegalArgumentException e) {

            } catch (IllegalAccessException e) {

            }

        }


        return str + "} ";

    }

   

    public static void main(String[] args) {

        AllTypes types = new AllTypes();

        System.out.println(ToString.toString(types));

    }

}