package com.example.githubactionsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsExampleApplication {
	@GetMapping("/message")
	public String message() {
		return "You are in CICD pipeline....";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsExampleApplication.class, args);
	}


//	echo "# github-actions-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/sabiaparveen1/github-actions-example.git
//	git push -u origin main
}
