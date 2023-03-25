package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.TelefonoDao;
import com.example.entities.Empleado;
import com.example.entities.Telefono;

@Service
public class TelefonoServiceImpl implements TelefonoService{

    @Autowired
    private TelefonoDao telefonoDao;

    @Override
    public List<Telefono> findAll() {
        return telefonoDao.findAll();
    }

    @Override
    public Telefono findById(int idTelefono) {
        return telefonoDao.findById(idTelefono).get();
    }

    @Override
    @Transactional
    public void svae(Telefono telefono) {
        telefonoDao.save(telefono);
    }

    @Override
    @Transactional
    public void deleteById(int idTelefono) {
        telefonoDao.deleteById(idTelefono);
    }

    @Override
    @Transactional
    public void deleteByEmpleado(Empleado empleado) {
        telefonoDao.deleteByEmpleado(empleado);
    }
    
}
