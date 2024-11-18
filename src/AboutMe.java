public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.

        //Escribe tu código aquí
        String myName = "Antonio";
        int myAge = 19;
        String myCountry = "España";
        String devLang = "Java";
        int devHours = 2;
        String myHobby = "Música";
        String hobbyPlace = "Casa";

        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println("Mi nombre es " + myName + ", tengo " + myAge + " años y soy de " + myCountry + ".");

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando " + devLang + " y practico " + devHours + " horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es " + myHobby + " y lo practico en " + hobbyPlace);
    }
}
