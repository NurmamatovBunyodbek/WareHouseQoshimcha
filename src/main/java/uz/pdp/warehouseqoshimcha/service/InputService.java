package uz.pdp.warehouseqoshimcha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.warehouseqoshimcha.dto.InputDto;
import uz.pdp.warehouseqoshimcha.model.*;
import uz.pdp.warehouseqoshimcha.repository.CurrencyRepository;
import uz.pdp.warehouseqoshimcha.repository.InputRepository;
import uz.pdp.warehouseqoshimcha.repository.SupplierRepository;
import uz.pdp.warehouseqoshimcha.repository.WareHouseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InputService {

    @Autowired
    InputRepository inputRepository;

    @Autowired
    CurrencyRepository currencyRepository;

    @Autowired
    SupplierRepository supplierRepository;

    @Autowired
    WareHouseRepository wareHouseRepository;


    // List

    public List<Input> getAllInput() {
        List<Input> list = inputRepository.findAll();
        return list;
    }

    // getById

    public Input getInputBYId(Integer id) {
        Optional<Input> inputOptional = inputRepository.findById(id);
        return inputOptional.get();
    }

    // create

    public Result createInput(InputDto inputDto) {
        Input input = new Input();
        Optional<Currency> optionalCurrency = currencyRepository.findById(inputDto.getCurrency());
        Currency currency = optionalCurrency.get();
        input.setCurrency(currency);

        Optional<Supplier> supplierOptional = supplierRepository.findById(inputDto.getSupplier());
        Supplier supplier = supplierOptional.get();
        input.setSupplier(supplier);

        Optional<WareHouse> wareHouseOptional = wareHouseRepository.findById(inputDto.getWareHouse());
        WareHouse wareHouse = wareHouseOptional.get();

        input.setWareHouse((List<WareHouse>) wareHouse);

        input.setFactureNumber(inputDto.getFactureNumber());
        input.setCode(inputDto.getCode());

        inputRepository.save(input);

        return new Result(true, "Successfully");

    }

    // update
    public Result updateInput(Integer id, InputDto inputDto) {

        Optional<Input> optionalInput = inputRepository.findById(id);
        if (optionalInput.isPresent()) {
            Input input = optionalInput.get();
            Optional<Currency> optionalCurrency = currencyRepository.findById(inputDto.getCurrency());
            Currency currency = optionalCurrency.get();
            input.setCurrency(currency);

            Optional<Supplier> supplierOptional = supplierRepository.findById(inputDto.getSupplier());
            Supplier supplier = supplierOptional.get();
            input.setSupplier(supplier);

            Optional<WareHouse> wareHouseOptional = wareHouseRepository.findById(inputDto.getWareHouse());
            WareHouse wareHouse = wareHouseOptional.get();

            input.setWareHouse((List<WareHouse>) wareHouse);

            input.setFactureNumber(inputDto.getFactureNumber());
            input.setCode(inputDto.getCode());

            inputRepository.save(input);

            return new Result(true, "Updated");
        }
        return new Result(false, "Not updated");
    }

    // deleted

    public Result deleted(Integer id) {
        inputRepository.deleteById(id);
        return new Result(true, "Deleted");
    }


}
