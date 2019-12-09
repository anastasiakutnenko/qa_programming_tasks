package task12;

import java.io.*;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import utils.FileReader;

import java.io.IOException;

public class Task12 {
    private static FileReader fileReader;
    private static final String folderPath = System.getProperty("user.dir") + "/images";

    public static void main(String[] args) throws IOException {
        fileReader = new FileReader();
        String webSiteURL = fileReader
                .getPropValues("properties/properties_task12.properties", "webSiteURL");
        Document doc = Jsoup.connect(webSiteURL).get();
        Elements img = doc.getElementsByTag("img");

        for (Element el : img) {
            String src = el.absUrl("src");
            System.out.println("Image Found!");
            System.out.println("src attribute is : " + src);
            getImages(src);
        }
    }

    private static void getImages(String src) throws IOException {
        int indexName = src.lastIndexOf("/");
        System.out.println(indexName);
        String name = src.substring(indexName);
        System.out.println(name);
        URL url = new URL(src);
        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream(folderPath + name);

        for (int b; (b = in.read()) != -1; ) {
            out.write(b);
        }
        out.close();
        in.close();
    }
}