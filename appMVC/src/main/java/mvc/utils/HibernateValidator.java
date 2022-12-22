package mvc.utils;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;



import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;



public class HibernateValidator {
    private static HibernateValidator hibernateValidator;



   private HibernateValidator() {
    }
    public static HibernateValidator getIntance() {
        if (hibernateValidator == null)
            hibernateValidator = new HibernateValidator();
        return hibernateValidator;
    }



   public <E> Map<String, String> getMessValidator(E e) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<E>> violations = validator.validate(e);
        Map<String, String> map = new HashMap<>();
        for (ConstraintViolation<E> violation : violations) {
            map.put(violation.getPropertyPath().toString(), violation.getMessage());
        }
        return map;
    }
}