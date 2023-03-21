package com.rap.Demoproject;
import com.rap.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {


    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/add/{firstnum}/{secondnum}")
    public ResponseEntity<Object> addRequestParams(@PathVariable("firstnum") double firstnumber,
                      @PathVariable("secondnum") double secondnumber)
    {
        if(firstnumber==0|| secondnumber==0){
            return new ResponseEntity<>("Invalid input, Please check it", HttpStatus.BAD_REQUEST);
        }
        double result = calculatorService.add(firstnumber,secondnumber);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("/divide/{firstnum}/{secondnum}")
    public ResponseEntity<Object> divideRequestParams(@PathVariable("firstnum") double firstnumber,
                                                   @PathVariable("secondnum") double secondnumber)
    {
        if(firstnumber==0|| secondnumber==0){
            return new ResponseEntity<>("Invalid input, Please check it", HttpStatus.BAD_REQUEST);
        }
        double result = calculatorService.divide(firstnumber,secondnumber);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("/multipli/{firstnum}/{secondnum}")
    public ResponseEntity<Object> multiplicationRequestParams(@PathVariable("firstnum") double firstnumber,
                                                   @PathVariable("secondnum") double secondnumber)
    {
        if(firstnumber==0|| secondnumber==0){
            return new ResponseEntity<>("Invalid input, Please check it", HttpStatus.BAD_REQUEST);
        }
        double result = calculatorService.multiply(firstnumber,secondnumber);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("/sub/{firstnum}/{secondnum}")
    public ResponseEntity<Object> subRequestParams(@PathVariable("firstnum") double firstnumber,
                                                      @PathVariable("secondnum") double secondnumber)
    {
        if(firstnumber==0|| secondnumber==0){
            return new ResponseEntity<>("Invalid input, Please check it", HttpStatus.BAD_REQUEST);
        }
        double result = calculatorService.substraction(firstnumber,secondnumber);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
