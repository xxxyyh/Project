package com.threebody.admins.config;

import java.io.File;

/**
 * 图片上传工具类
 * @author Administrator
 *
 */
public class UploadUtils {
	// 项目根路径下的目录  -- SpringBoot static 目录相当于是根路径下（SpringBoot 默认） 
//    public final static String IMG_PATH_PREFIX = "static/goods/imgs";

    public static File getImgDirFile(String path){

        // 构建上传文件的存放 "文件夹" 路径
        String fileDirPath = new String("src/main/resources/static/" + path);

        File fileDir = new File(fileDirPath);
        if(!fileDir.exists()){
            // 递归生成文件夹
            fileDir.mkdirs();
        }
        return fileDir;
    }
}
