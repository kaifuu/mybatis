package com.hbt.data;

import com.hbt.model.RescueTeam;

import java.util.List;

public interface RescueTeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RescueTeam record);

    int insertSelective(RescueTeam record);

    RescueTeam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RescueTeam record);

    int updateByPrimaryKey(RescueTeam record);


}