package com.zhf.data;

import com.zhf.model.RescueTeam;

public interface RescueTeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RescueTeam record);

    int insertSelective(RescueTeam record);

    RescueTeam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RescueTeam record);

    int updateByPrimaryKey(RescueTeam record);
}