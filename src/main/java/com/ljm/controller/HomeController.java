package com.ljm.controller;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import java.time.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ljm.domain.Board;
import com.ljm.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("")
@Controller
public class HomeController {
	
	@Autowired
	private BoardService boardService;
	
	    public HomeController(BoardService boardService) {
	        this.boardService = boardService;
	    }

	 @RequestMapping("/")
	    public String getAllBoards(Model model) {	
	        List<Board> boards = boardService.getAllBoards();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	      
	        for (Board board : boards) {
	        	  LocalDateTime noticeDateTime = board.getNoticeDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	        	  board.setFormattedNoticeDate(noticeDateTime.format(formatter)); // Format LocalDateTime and set it
	        }

	        for (Board board : boards) {
	            log.info("Board Á¤º¸: {}", board);
	        }
	        model.addAttribute("boards", boards);
	        return "home"; 
	        
	    }
	 @GetMapping("/BoardWrite")
	 public String BoardWrite(){
		 return "/BoardWrite";
	 }
	 
	 @RequestMapping(value="/BoardInsert")
	 public String boardInsert(Board board) throws Exception{
		 boardService.insertBoardS(board);
		 return "redirect:/";
	 
//	 public ModelAndView boardInsert(Board board) throws Exception {
//        ModelAndView mav = new ModelAndView("redirect:/home");
//        boardService.insertBoardS(board);
//        return mav;
	 }
}


