package uz.pdp.warehouseqoshimcha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.warehouseqoshimcha.model.Client;
import uz.pdp.warehouseqoshimcha.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;


    public List<Client>  getAll(){
        List<Client> clientList = clientRepository.findAll();
        return clientList;

    }

    public Client getBYIDClient(Integer id){
        Optional<Client> clientOptional = clientRepository.findById(id);
        return clientOptional.get();
    }

    // create




}
