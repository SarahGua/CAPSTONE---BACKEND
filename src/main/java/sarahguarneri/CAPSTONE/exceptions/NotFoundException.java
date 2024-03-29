package sarahguarneri.CAPSTONE.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException{
    public NotFoundException(UUID id){
       super("User with id " + id + " not found");
    }

    public NotFoundException(int id){
        super("Field with id " + id + " not found");
    }

    public NotFoundException(String message) {
        super(message);
    }
}
