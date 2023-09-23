import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.Column;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.sql.types.StructField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.github.javafaker.Faker;
import java.time.LocalDate;

public class GenerateAndSaveParquetData {
    public static void main(String[] args) {
        // Khởi tạo SparkSession sinh dữ liệu
        SparkSession spark = SparkSession.builder()
                .appName("Generate and Save Parquet Data")
                .getOrCreate();

        // Tạo schema cho DataFrame
        StructType schema = DataTypes.createStructType(new StructField[] {
                DataTypes.createStructField("Name", DataTypes.StringType, false),
                DataTypes.createStructField("Birthdate", DataTypes.DateType, false),
                DataTypes.createStructField("Address", DataTypes.StringType, false),
                DataTypes.createStructField("Gender", DataTypes.StringType, false)
        });

        // Tạo danh sách chứa 100 bản ghi ngẫu nhiên
        Faker fake = new Faker();
        List<Row> data = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            String name = fake.name().fullName();
            LocalDate birthdate = fake.date().birthday(1, 100);
            String address = fake.address().fullAddress();
            String gender = new String[] { "Male", "Female" }[new Random().nextInt(2)];
            Row record = RowFactory.create(name, birthdate, address, gender);
            data.add(record);
        }

        // Tạo DataFrame từ danh sách dữ liệu và schema
        Dataset<Row> df = spark.createDataFrame(data, schema);

        // Tính toán độ tuổi và thêm cột "age" vào DataFrame
        Column ageColumn = functions.datediff(functions.current_date(), "birthdate")
                .divide(365.25)
                .cast(DataTypes.IntegerType);

        df = df.withColumn("age", ageColumn);

        // Lưu DataFrame thành tệp Parquet
        String parquetOutputPath = "/home/thanhhuy@VMubuntu/output.parquet";
        df.write().mode("overwrite").parquet(parquetOutputPath);
    }
}