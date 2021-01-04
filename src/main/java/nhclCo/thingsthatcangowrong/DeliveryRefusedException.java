package nhclCo.thingsthatcangowrong;

public class DeliveryRefusedException extends RuntimeException{
	public DeliveryRefusedException(String message) {
        super(message);
    }
}
