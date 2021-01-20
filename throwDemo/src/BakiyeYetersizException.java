public class BakiyeYetersizException extends Exception{
        String message;
        public BakiyeYetersizException(String message){
            this.message = message;
        }

    @Override
    public  String getMessage() {
        return this.message;
    }
}
