package uz.pdp.warehouseqoshimcha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.warehouseqoshimcha.dto.InputDto;
import uz.pdp.warehouseqoshimcha.model.Input;
import uz.pdp.warehouseqoshimcha.model.Result;
import uz.pdp.warehouseqoshimcha.service.InputService;

import java.util.List;

@RestController
@RequestMapping("/input")
public class InputController {

    @Autowired
    InputService inputService;


    @GetMapping
    public List<Input> getALL() {
        List<Input> list = inputService.getAllInput();
        return list;
    }

    @GetMapping("/{id}")
    public Input getBYIDINPut(@PathVariable Integer id) {
        Input input = inputService.getInputBYId(id);
        return input;
    }

    @PostMapping
    public Result add(@RequestBody InputDto inputDto) {
        Result result = inputService.createInput(inputDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result edit(@PathVariable Integer id, @RequestBody InputDto inputDto) {
        Result result = inputService.updateInput(id, inputDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result del(@PathVariable Integer id) {
        Result result = inputService.deleted(id);
        return result;
    }


}
