package com.sela.GitHubActions;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

class GitHubActionsApplicationTests {

	@Test
	void test() {
		Integer x = 5;
		assertEquals("not equals", 5, x);
	}

}
