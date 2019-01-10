package design_patterns.observer;

/**
 * Created by dell on 2018/12/28.
 */
public class AnimeObserverAble implements ObserverAble {
	private Observer observer;

	private String name;

	public AnimeObserverAble(Observer observer,String name){
          observer.addObserverAble(this);
          this.name = name;
	}

	public boolean delete(){
		if(observer != null)
			observer.deleteObserverAble(this);
		return true;
	}

	@Override
	public void update(Observer observer) {
        System.out.println(name + "收到了通知:" + observer.getNews());
	}
}
