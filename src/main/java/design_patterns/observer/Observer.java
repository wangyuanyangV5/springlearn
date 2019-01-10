package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/12/28.
 */
public class Observer {

	private String news;

	private List<ObserverAble> observerAbles = new ArrayList<>();

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
		change();
	}

	public boolean addObserverAble(ObserverAble observerAble){
		return observerAbles.add(observerAble);
	}

	public boolean deleteObserverAble(ObserverAble observerAble){
		return observerAbles.remove(observerAble);
	}

	private void change(){
		observerAbles.forEach(observerAble -> observerAble.update(this));
	}
}
