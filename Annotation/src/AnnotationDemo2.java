import java.lang.annotation.Documented;

@Documented
@interface Persistable{}

@Persistable
public class AnnotationDemo2 {
    public static void main(String[] args) {


    }
}
class AnnotationDemo extends AnnotationDemo2{}
