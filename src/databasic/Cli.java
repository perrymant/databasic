package databasic;


class Cli {
    void stats(){
        System.out.println("The statistics on the database are: ");
    }

    void query(Id id, JsonPath jsonpath){
        System.out.println("Cli.query");
    }

    void insert(String string){
        System.out.println("Cli.insert");
    }

}

