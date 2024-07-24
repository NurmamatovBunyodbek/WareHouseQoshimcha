package uz.pdp.warehouseqoshimcha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.warehouseqoshimcha.dto.OutPutDto;
import uz.pdp.warehouseqoshimcha.model.*;
import uz.pdp.warehouseqoshimcha.repository.ClientRepository;
import uz.pdp.warehouseqoshimcha.repository.CurrencyRepository;
import uz.pdp.warehouseqoshimcha.repository.OutPutRepository;
import uz.pdp.warehouseqoshimcha.repository.WareHouseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OutPutService {

    @Autowired
    OutPutRepository outPutRepository;

    @Autowired
    WareHouseRepository wareHouseRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CurrencyRepository currencyRepository;


    public List<OutPut> getAllOutPut() {
        List<OutPut> outPutList = outPutRepository.findAll();
        return outPutList;
    }

    // create
    public Result createOutPut(OutPutDto outPutDto) {
        OutPut outPut = new OutPut();

        Optional<WareHouse> houseOptional = wareHouseRepository.findById(outPutDto.getWareHouseId());
        WareHouse wareHouse = houseOptional.get();

        outPut.setWareHouse(wareHouse);
        outPut.setCode(outPutDto.getCode());
        outPut.setFactureNumber(outPutDto.getFactureNumber());

        List<Client> clientList = clientRepository.findAll();
        outPut.setClient(clientList);

        Optional<Currency> currencyOptional = currencyRepository.findById(outPutDto.getCurrencyId());
        Currency currency = currencyOptional.get();
        outPut.setCurrency((List<Currency>) currency);

        outPutRepository.save(outPut);

        return new Result(true, "Created");
    }

    //update

    public Result updateOutPut(Integer id, OutPutDto outPutDto) {


        return new Result(false, "not found");
    }


    // delete
    public Result delete(Integer id) {
        outPutRepository.deleteById(id);
        return new Result(true, "Deleted");
    }


}
