package jp.opentel.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import jp.opentel.www.form.TelInfoForm;

@Controller
public class IndexController {
  @GetMapping("/")
  public String index(@ModelAttribute TelInfoForm telInfoForm) {
    return "index";
  }

  @GetMapping("/{tel}")
  public String search(@PathVariable String tel, @ModelAttribute TelInfoForm telInfoForm) {
    telInfoForm.setTel(tel);
    return "telInfo";
  }
}
