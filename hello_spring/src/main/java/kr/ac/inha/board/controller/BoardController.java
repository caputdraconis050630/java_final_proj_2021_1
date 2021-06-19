package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BoardController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world!!";
	}
	@RequestMapping("./inha")
	public String inha() {
		return "inha.ac.kr";
	}
}
