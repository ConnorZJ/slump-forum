package com.connor.slump;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenMain {
    public static void main(String[] args) {

        // 创建代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        // 创建数据源配置对象
        DataSourceConfig dataSourceConfig = new DataSourceConfig();

        // 设置数据库类型
        dataSourceConfig.setDbType(DbType.MYSQL);
        // 设置url
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/slump?serverTimezone=Asia/Shanghai&characterEncoding=utf8");
        // 设置驱动
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        // 设置用户名
        dataSourceConfig.setUsername("root");
        // 设置密码
        dataSourceConfig.setPassword("xzjroot");

        // set数据源配置对象
        autoGenerator.setDataSource(dataSourceConfig);

        // 创建数据库表配置对象
        StrategyConfig strategyConfig = new StrategyConfig();

        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setTablePrefix("slump_");
        strategyConfig.setSuperEntityClass("com.connor.slump.model.IBaseModel");

        // set数据库表配置对象
        autoGenerator.setStrategy(strategyConfig);

        // 创建包名配置对象
        PackageConfig packageConfig = new PackageConfig();

        packageConfig.setParent("com.connor");
        packageConfig.setModuleName("slump");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setEntity("model");
        packageConfig.setMapper("dao");
        packageConfig.setXml("mapper");

        // set包名配置对象
        autoGenerator.setPackageInfo(packageConfig);

        // 创建模板配置对象
        TemplateConfig templateConfig = new TemplateConfig();

        // set模板配置对象
        autoGenerator.setTemplate(templateConfig);

        // 创建全局策略配置对象
        GlobalConfig globalConfig = new GlobalConfig();

        globalConfig.setOutputDir("D://codegen");
        globalConfig.setFileOverride(true);
        globalConfig.setAuthor("Connor");
        globalConfig.setSwagger2(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setBaseResultMap(true);
        globalConfig.setEntityName("%sModel");
        globalConfig.setMapperName("%sDao");
        globalConfig.setXmlName("%s_sql");
        globalConfig.setServiceName("%sService");
        globalConfig.setServiceImplName("%sServiceImpl");
        globalConfig.setControllerName("%sController");
        globalConfig.setIdType(IdType.ASSIGN_UUID);

        // set全局策略配置对象
        autoGenerator.setGlobalConfig(globalConfig);

        // 执行生成代码
        autoGenerator.execute();

    }
}
