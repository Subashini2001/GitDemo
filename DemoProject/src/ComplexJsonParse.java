import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(payload.CoursePrice());
//print no of courses returned in API
		int count = js.getInt("courses.size()");
		System.out.println(count);

	}

}