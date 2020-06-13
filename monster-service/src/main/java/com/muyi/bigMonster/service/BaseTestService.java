package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.ComplexMetricsProjectInfoMapper;
import com.muyi.bigMonster.mapper.daily1.DiffCoverageReportMapper;
import com.muyi.bigMonster.mapper.daily1.LiveVideoAttributeMapper;
import com.muyi.bigMonster.mapper.daily1.ProjectServerInfoMapper;
import com.muyi.bigMonster.mapper.daily2drds.PBuyerResourceMapper;
import com.muyi.bigMonster.model.daily1.*;
import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class BaseTestService {

    @Resource
    private LiveVideoAttributeMapper liveVideoAttributeMapper;

    @Resource
    private PBuyerResourceMapper pBuyerResourceMapper;

    @Resource
    private ProjectServerInfoMapper projectServerInfoMapper;

    @Resource
    private DiffCoverageReportMapper diffCoverageReportMapper;


    public void case01() {
        LiveVideoAttribute liveVideoAttribute = liveVideoAttributeMapper.selectByPrimaryKey(1);
        Integer accountId = liveVideoAttribute.getAccountId();
        System.out.println("accountId:" + accountId);

    }

    public void case02() {
        PBuyerResource pBuyerResource = pBuyerResourceMapper.selectByPrimaryKey(200468L);
        Long accountId = pBuyerResource.getAccountId();
        System.out.println("accountId:" + accountId);

    }

    public void case03(Integer buyerResourceId, String time) {
        int number = pBuyerResourceMapper.updateById(1406249, "2020-05-23 23:00:00");
        System.out.println("update number:" + number);
    }

    public void case04() {
        ProjectServerInfoExample example = new ProjectServerInfoExample();
        example.createCriteria().andProjectNameEqualTo("big-monster");
        ProjectServerInfo projectServerInfo = projectServerInfoMapper.selectByExample(example).get(0);
        String ip = projectServerInfo.getIp();
        int port = projectServerInfo.getPort();

        System.out.println(">>> ip = " + ip);
        System.out.println(">>> port = " + port);
    }

    public void case05(int currentPage, int pageSize) {
        DiffCoverageReportExample example = new DiffCoverageReportExample();
        example.setOrderByClause("id desc");
        example.createCriteria().andCreatetimeIsNotNull();
        RowBounds rowBounds = new RowBounds(currentPage - 1, pageSize);
        List<DiffCoverageReport> diffCoverageReports = diffCoverageReportMapper.selectByExampleWithRowbounds(example, rowBounds);

        System.out.println(">>> " + diffCoverageReports.size());
    }
}
