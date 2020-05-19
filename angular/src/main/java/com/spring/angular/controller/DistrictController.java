package com.spring.angular.controller;


import com.spring.angular.repository.IDistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import com.spring.angular.model.ntt_dat_district;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class DistrictController {

    @Autowired
    private IDistrictRepository districtRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/district")
    public List<ntt_dat_district> usersList()
    {
        return  districtRepository.findAll();

    }

    @GetMapping(value ="/district/{districtid}")
    public List<ntt_dat_district> GetUserId(@PathVariable("districtid") Integer id)
    {
        return get(id);

    }


    public List<ntt_dat_district> get(int id)
    {
        String sql = "SELECT city_id,district_id,district_name from ntt_dat_district where city_id =?";
        Object[] args = {id};
        List<ntt_dat_district> users = jdbcTemplate.query(sql,args,BeanPropertyRowMapper.newInstance(ntt_dat_district.class));

        return users;
    }
}
