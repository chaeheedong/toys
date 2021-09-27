package com.heedong.toys.thymeleaf.controller;

import com.heedong.toys.thymeleaf.dto.ThymeleafVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {


    /**
     * th:href="@{/url}" 사용법
     * 목차만들기
     * @return String
     */
    @RequestMapping(path = "/00", method = RequestMethod.GET)
    public String thymeleaf00() {
        return "thymeleaf/00thHref";
    }


    /**
     * th:Text=${data} 사용법
     * 화면에 String으로 데이터를 전송하기
     * @param  model
     * @return String
     */
    @RequestMapping(path = "/01", method = RequestMethod.GET)
    public String thymeleaf01(Model model) {
        model.addAttribute("data", "th:text usage.");
        return "thymeleaf/01thText";
    }


    /**
     * th:Text=${vo.**} 사용법
     * 화면에 객체로 데이터를 전송하기
     * @param  model
     * @return String
     */
    @RequestMapping(path = "/02", method = RequestMethod.GET)
    public String thymeleaf02(Model model) {
        ThymeleafVO vo = ThymeleafVO.builder()
                .title("제목")
                .contents("내용")
                .currentTime(LocalDateTime.now())
                .build();
        model.addAttribute("vo", vo);
        return "thymeleaf/02thTextVO";
    }


    /**
     * th:each="list, status: ${listVO}" 사용법
     * for in 문법과 비슷함
     * @param  model
     * @return String
     */
    @RequestMapping(path = "/03", method = RequestMethod.GET)
    public String thymeleaf03(Model model) {
        model.addAttribute("listVO", getThymeleafVO(1, 5));
        return "thymeleaf/03thEach";
    }


    /**
     * th:if="${조건}", th:unless="${조건}" 사용법
     * if ~ else 와 같음
     * @param  model
     * @return String
     */
    @RequestMapping(path = "/04", method = RequestMethod.GET)
    public String thymeleaf04(Model model) {
        model.addAttribute("listVO", getThymeleafVO(1, 10));
        return "thymeleaf/04thIf";
    }


    /**
     * th:switch="${조건}" 사용법
     * switch ~ case 와 같음
     * @param  model
     * @return String
     */
    @RequestMapping(path = "/05", method = RequestMethod.GET)
    public String thymeleaf05(Model model) {
        model.addAttribute("listVO", getThymeleafVO(1, 15));
        return "thymeleaf/05thSwitch";
    }


    /**
     * 쿼리스트링 사용법
     * @param  str1
     * @param  str2
     * @param  model
     * @return String
     */
    @RequestMapping(path = "/06", method = RequestMethod.GET)
    public String thymeleaf06(String str1, String str2, Model model) {
        model.addAttribute("str1", str1);
        model.addAttribute("str2", str2);
        return "thymeleaf/06queryString";
    }


    /**
     * 테스트용 객체 생성
     * @param  begin
     * @param  end
     * @return List<ThymeleafVO>
     */
    public List<ThymeleafVO> getThymeleafVO(int begin, int end) {
        List<ThymeleafVO> listVO = new ArrayList<>();
        IntStream.rangeClosed(begin, end).forEach(i -> {
            listVO.add(
                    ThymeleafVO.builder()
                            .title("제목" + i)
                            .contents("내용" + i)
                            .currentTime(LocalDateTime.now().plusDays(i))
                            .build()
            );
        });
        return listVO;
    }
}
