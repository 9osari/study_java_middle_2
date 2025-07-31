package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if(currentPage != null) {
            //현재페이지가 있으면 히스토리에 한번 넣어줌
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문:" +url);
    }

    public String goBack() {
        if(!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
