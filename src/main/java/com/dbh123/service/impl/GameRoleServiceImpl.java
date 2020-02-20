package com.dbh123.service.impl;

import com.dbh123.mapper.GameRoleMapper;
import com.dbh123.service.GameRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("gameRoleService")
@Transactional
public class GameRoleServiceImpl implements GameRoleService {
    @Autowired
    private GameRoleMapper gameRoleDao;
}
