class Badge {
    private static final String OWNER = "OWNER";
    
    public String print(Integer id, String name, String department) {
        Integer identity = id;
        // verificar se é OWNER sem id
        if(AreNullable(identity, department)) return String.format("%s - %s", name, Badge.OWNER);
        // verificar se é OWNER com id
        if(isNullable(department)) return String.format("[%s] - %s - %s", id, name, Badge.OWNER);
        // verificar se é funcionário novo sem id
        if (isNullable(identity)) return String.format("%s - %s", name, department.toUpperCase());
        // funcionário DEFAULT com todos os dados
        return String.format("[%s] - %s - %s", id, name, department.toUpperCase());
        
    }

    private static <T> boolean isNullable(T type){
        return type == null ? true : false;
    }
    private static <N extends Number, S extends CharSequence> boolean AreNullable(N t1, S t2){
        return t1 == null && t2 == null ? true : false;
    }
}

class Badge {
    private static final String OWNER = "OWNER";
    
    public String print(Integer id, String name, String department) {
        if( department == null){
            if(id == null)    
                return String.format("%s - %s", name, Badge.OWNER);
            return String.format("[%s] - %s - %s", id, name, Badge.OWNER);
        }
        if(id == null)
            return String.format("%s - %s", name, department.toUpperCase());
        
        return String.format("[%s] - %s - %s", id, name, department.toUpperCase());
    }
}
