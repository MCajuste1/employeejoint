package GroupBHW03;

public class PersonHandler {
    private final PersonHandler[] personArray;

    public PersonHandler(PersonHandler[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length)
        // begin loop
            System.out.println(counter);
        counter++;

        // use `counter` to identify the `current Person` in the array

        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }


    public PersonHandler[] getPersonArray() {
        return personArray;
    }
}