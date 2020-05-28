package com.spring.angular.controller;


import com.spring.angular.repository.IDistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import com.spring.angular.model.District;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class DistrictController {

    @Autowired
    private IDistrictRepository districtRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/district")
    public List<District> usersList()
    {
        return  districtRepository.findAll();

    }

    @GetMapping(value ="/district/{districtid}")
    public List<District> GetUserId(@PathVariable("districtid") Integer id)
    {
        return get(id);

    }


    public List<District> get(int id)
    {
        String sql = "SELECT city_id,district_id,district_name from ntt_dat_district where city_id =?";
        Object[] args = {id};
        List<District> users = jdbcTemplate.query(sql,args,BeanPropertyRowMapper.newInstance(District.class));

        return users;
    }
}
