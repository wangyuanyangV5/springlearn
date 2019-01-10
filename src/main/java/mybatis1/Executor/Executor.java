package mybatis1.Executor;

/**
 * Created by dell on 2019/1/10.
 */
public interface Executor {


	<T>  T query(String statement, Object parameter);

}
