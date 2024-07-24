package uz.pdp.warehouseqoshimcha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;
import uz.pdp.warehouseqoshimcha.dto.OutPutDto;
import uz.pdp.warehouseqoshimcha.model.OutPut;
import uz.pdp.warehouseqoshimcha.model.Result;
import uz.pdp.warehouseqoshimcha.service.OutPutService;

import java.util.List;

@RestController
@RequestMapping("/output")

public class OutPutController {

    @Autowired
    OutPutService outPutService;

    @GetMapping
    public List<OutPut> getOutAll(){
        List<OutPut> list = outPutService.getAllOutPut();
        return list;
    }

    @PostMapping
    public Result add(@RequestBody OutPutDto outPutDto){
        Result result = outPutService.createOutPut(outPutDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result edit(@PathVariable Integer id,  @RequestBody OutPutDto outPutDto){
        Result result = outPutService.updateOutPut(id, outPutDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result del(@PathVariable Integer id){
        Result delete = outPutService.delete(id);
        return delete;
    }

}
