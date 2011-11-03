package ut.cb.util.maps;

public class SubtractMapOperator<K> extends AbstractMapOperator<K, Number>
{

    @Override
    protected Double applyToValues(Number a, Number b)
    {
        try {
            return (Double) a - (Double) b;
        } catch (ClassCastException ex) {
            return null;
        }
    }
}
