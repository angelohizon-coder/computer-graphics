import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nl.captcha.Captcha;
import static nl.captcha.Captcha.NAME;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;
import nl.captcha.gimpy.FishEyeGimpyRenderer;
import nl.captcha.noise.StraightLineNoiseProducer;
import nl.captcha.servlet.CaptchaServletUtil;
import nl.captcha.text.producer.ChineseTextProducer;

public class SimpleCaptchaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Captcha captcha = new Captcha.Builder(250, 50)
        .addText(new ChineseTextProducer(6))
        .addBackground(new GradiatedBackgroundProducer())
        .addNoise(new StraightLineNoiseProducer())
        .gimp(new FishEyeGimpyRenderer())
        .addBorder()
        .build();
        
        CaptchaServletUtil.writeImage(response, captcha.getImage());

        request.getSession().setAttribute(NAME, captcha);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
