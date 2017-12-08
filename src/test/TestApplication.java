import com.gentlehu.hblog.Application;
import com.gentlehu.hblog.pojo.Article;
import com.gentlehu.hblog.service.IArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by gentle-hu on 2017/12/8 19:59.
 * Email:gentle-hu@qq.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestApplication {


    @Autowired
    private IArticleService articleService;

    @Test
    public void testArticle(){
//        Article article = articleService.findById(1);
//        System.out.println(GsonUtils.toJson(article));
//        int count = articleService.getCount();
//        System.out.println("count="+count);
        Article article = new Article();
        article.setContent("这是第1篇文章内容");
        articleService.update(1,article);
    }

}
