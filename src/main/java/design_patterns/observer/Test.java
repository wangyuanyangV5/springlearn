package design_patterns.observer;

/**
 * Created by dell on 2018/12/28.
 * 观察者模式
 */
public class Test {

	public static void main(String[] args){
		Observer observer = new Observer();
		AnimeObserverAble observerAble = new AnimeObserverAble(observer,"AAAAA");
		AnimeObserverAble observerAble1 = new AnimeObserverAble(observer,"BBBBB");
		observer.setNews("发通知啦");
	}

}
