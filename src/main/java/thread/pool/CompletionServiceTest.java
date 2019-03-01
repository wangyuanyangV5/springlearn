package thread.pool;

import com.sun.scenario.effect.ImageData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by dell on 2019/2/27.
 */
public class CompletionServiceTest {

    private final ExecutorService executorService;

    public CompletionServiceTest(ExecutorService executorService){
        this.executorService = executorService;
    }

    public void renderPage(CharSequence source){
        List<ImageInfo> info = new ArrayList<>();
        List< ImageData> imageDataList = new ArrayList<>();
        CompletionService<ImageData> completionService = new ExecutorCompletionService<ImageData>(executorService);
        for(final  ImageInfo imageInfo : info){
            completionService.submit(new Callable<ImageData>() {
                @Override
                public ImageData call() throws Exception {
                    return imageInfo.downloadImag();
                }
            });

             for(int t = 0,n = info.size();t < n;++t){
                 ImageData imageData = null;
                try{
                    Future<ImageData> f = completionService.take();
                    imageData = f.get();
                    //get加入一个调用超时，如果超时，取消任务执行并进行结果处理
//                    imageData = f.get( 1000,TimeUnit.SECONDS);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }catch (ExecutionException e) {
                    e.printStackTrace();
                }
//                catch (TimeoutException e) {
//                    e.printStackTrace();
//                    imageData = null;
//                }
             }

        }
    }

    static class ImageInfo{
        public ImageData downloadImag(){
           return null;
        }
    }
}
