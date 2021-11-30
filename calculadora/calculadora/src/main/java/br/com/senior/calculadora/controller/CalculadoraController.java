package br.com.senior.calculadora.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/add")
	public ResponseEntity<Double> add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		return ResponseEntity.ok().body(num1 + num2);
	}

	@GetMapping("/sub")
	public ResponseEntity<Double> sub(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		return ResponseEntity.ok().body(num1 - num2);
	}

	@GetMapping("/multiply")
	public ResponseEntity<Double> multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		return ResponseEntity.ok().body(num1 * num2);
	}

	@GetMapping("/div")
	public ResponseEntity<Double> div(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		return ResponseEntity.ok().body(num1 / num2);
	}

	@GetMapping("/numbers/add")
	public ResponseEntity<Double> numbersAdd(@RequestParam("numbers") String numbers) {
		String[] nums = numbers.split(",");

		Double result = (double) 0;

		for (int i = 0; i < nums.length; i++) {
			result += Double.parseDouble(nums[i]);
		}

		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/numbers/sub")
	public ResponseEntity<Double> numbersSub(@RequestParam("numbers") String numbers) {
		String[] nums = numbers.split(",");

		Double result = Double.parseDouble(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			result -= Double.parseDouble(nums[i]);
		}

		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/numbers/multiply")
	public ResponseEntity<Double> numbersMultiply(@RequestParam("numbers") String numbers) {
		String[] nums = numbers.split(",");

		Double result = (double) 1;

		for (int i = 0; i < nums.length; i++) {
			result *= Double.parseDouble(nums[i]);
		}

		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/numbers/div")
	public ResponseEntity<Double> numbersDiv(@RequestParam("numbers") String numbers) {
		String[] nums = numbers.split(",");

		Double result = Double.parseDouble(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			result /= Double.parseDouble(nums[i]);
		}

		return ResponseEntity.ok().body(result);
	}

}
