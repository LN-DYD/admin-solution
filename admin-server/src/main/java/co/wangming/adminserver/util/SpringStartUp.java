package co.wangming.adminserver.util;

import co.wangming.adminserver.service.BackendPermissionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created By WangMing On 2020-03-02
 **/
@Component
public class SpringStartUp implements CommandLineRunner {

    @Resource
    private BackendPermissionService backendPermissionService;

    @Override
    public void run(String... args) throws Exception {

        // 将接口请求路径存储到数据库里
        backendPermissionService.initPermissions();

    }
}
