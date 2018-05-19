package com.xbp.springmybatis.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/19 14:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BookControllerTest  extends AbstractContextControllerTests{
    private MockMvc mockMvc;
    private String listUrl = "/book/list";
    private String detailUrl = "/book/{bookId}/detail";
    private String appointUrl = "/book/{bookId}/appoint";
    private long bookId = 1000;

    @Before
	public void setup() {
		this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).alwaysDo(print()).build();
	}

    	@Test
	public void list() throws Exception {
		this.mockMvc.perform(get(listUrl)).andExpect(view().name("/book/book"));
	}

	@Test
	public void existDetail() throws Exception {
		this.mockMvc.perform(get(detailUrl, bookId)).andExpect(view().name("/book/book"))
				.andExpect(model().attributeExists("message"));
	}

}
