package com.hch.action;

import com.hch.QaToolsException;
import com.hch.utils.security.Base64;
import net.sourceforge.plantuml.SourceStringReader;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.impl.cookie.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.Calendar;

/**
 * Created by huaiwang on 13-12-13.
 */
@Controller
@RequestMapping("/plantuml")
public class PlantUmlController {
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "plantuml";
    }


    @ResponseBody
    @RequestMapping(value = "post", method = RequestMethod.POST)
    public String post(String source) {
        try {
            String fn = DateUtils.formatDate(Calendar.getInstance().getTime(), "yyyyMMddHHmmssSSS");
            File file = File.createTempFile(fn, ".txt");
            OutputStream png = new FileOutputStream(file);

            SourceStringReader reader = new SourceStringReader(source);
            // Write the first image to "png"
            String desc = reader.generateImage(png);
            // Return a null string if no generation

            if (desc == null) {
                throw new QaToolsException("no generation");
            } else {
                String en = file2b64(file);
                file.delete();
                return en;
            }
        } catch (Exception e) {
            return "ERR";
        } finally {
        }
    }


    public String file2b64(File file) throws IOException {
        FileInputStream is = new FileInputStream(file);
        byte[] bytes = IOUtils.toByteArray(is);
        byte[] encodedBytes = org.apache.commons.codec.binary.Base64.encodeBase64(bytes);
        return new String(encodedBytes);
    }
}
