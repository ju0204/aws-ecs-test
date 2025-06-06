package actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class ActionsController {
	
	@GetMapping(value = "/api/actions")
	public String actionsTest() {
		return "app-with-actions version:0.0.2";
	}

	@GetMapping("/health")
	public String healthCheck() {
    	// public ResponseEntity<String> healthCheck() {
        	// 항상 200 OK를 반환해서 헬스체크 성공 처리
        	// return ResponseEntity.ok("OK");
		return "I'm alive";
    	}
	
}
