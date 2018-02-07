package SA_UI;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExcelData {

    public static XSSFWorkbook bootstrap() throws FileNotFoundException, IOException{
        Path currentRelativePath = Paths.get("");
        String app = currentRelativePath.toAbsolutePath().toString();
        String FileName = app+"/SA_Info.xlsx";
        File src=new File(FileName);
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        return wb;
    }
}
