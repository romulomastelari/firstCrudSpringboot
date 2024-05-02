package noGroups.firstapi.handler;

public class RequiredFieldException extends BusinessException {
    public RequiredFieldException(String params) {
        super("O campo %s é obrigatório", params);
    }
}
