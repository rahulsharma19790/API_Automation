package PayLoadFiles;

public class Pyaload1 {

    public static String payload()
    {
       /* return "\"\\\"{\\\\n  \\\\\\\"location\\\\\\\": \" +\n" +
                "                        \"{\\\\n    \\\\\\\"lat\\\\\\\": -38.383494,\\\\n   \" +\n" +
                "                        \" \\\\\\\"lng\\\\\\\": 33.427362\\\\n  },\\\\n  \" +\n" +
                "                        \"\\\\\\\"accuracy\\\\\\\": 50,\\\\n  \\\\\\\"name\\\\\\\":\" +\n" +
                "                        \" \\\\\\\"Frontline house\\\\\\\",\\\\n  \\\\\\\"phone_number\\\\\\\":\" +\n" +
                "                        \" \\\\\\\"(+91) 983 893 3937\\\\\\\",\\\\n  \\\\\\\"address\\\\\\\": \" +\n" +
                "                        \"\\\\\\\"29, side layout, cohen 09\\\\\\\",\\\\n  \\\\\\\"types\\\\\\\": \" +\n" +
                "                        \"[\\\\n    \\\\\\\"shoe park\\\\\\\",\\\\n    \\\\\\\"shop\\\\\\\"\\\\n  ],\\\\n  \" +\n" +
                "                        \"\\\\\\\"website\\\\\\\": \\\\\\\"http://google.com\\\\\\\",\\\\n  \" +\n" +
                "                        \"\\\\\\\"language\\\\\\\": \\\\\\\"French-IN\\\\\\\"\\\\n}\\\"\\n\" +\n" +
                "                        \"\\t\\t\\t\\t},\"";
*/


       /* return "{
                "location": {"lat": -38.383494,"lng": 33.427362},
        "accuracy": 50,
            "name":"Rahul Shetty Academy",
            "phone_number": "(+91) 983 893 3937",
            "address": "29, side layout, cohen 09",
            "types": ["shoe park","shop"],
        "website":"http://rahulshettyacademy.com",
            "language":"French-IN" }";*/

          return "{\n" +
                  "                \"location\": {\"lat\": -38.383494,\"lng\": 33.427362},\n" +
                  "        \"accuracy\": 50,\n" +
                  "            \"name\":\"Rahul Shetty Academy\",\n" +
                  "            \"phone_number\": \"(+91) 983 893 3937\",\n" +
                  "            \"address\": \"29, side layout, cohen 09\",\n" +
                  "            \"types\": [\"shoe park\",\"shop\"],\n" +
                  "        \"website\":\"http://rahulshettyacademy.com\",\n" +
                  "            \"language\":\"French-IN\" }";
}
       /* public static String payload2()
        {

            return "{\n" +
                    "    \"place_id\":\""+path1+"\",\n" +
                    "    \"address\": \"29, side layout, cohen 09\",\n" +
                    "     \"key\":\"qaclick123\"\n" +
                    "\n" +
                    "}";
        }*/

         public static String coursePrice()
         {


             return "{\n" +
                     "\n" +
                     "\"dashboard\": {\n" +
                     "\n" +
                     "\"purchaseAmount\": 4760,\n" +
                     "\n" +
                     "\"website\": \"rahulshettyacademy.com\"\n" +
                     "\n" +
                     "},\n" +
                     "\n" +
                     "\"courses\": [\n" +
                     "\n" +
                     "{\n" +
                     "\n" +
                     "\"title\": \"Selenium Python\",\n" +
                     "\n" +
                     "\"price\": 50,\n" +
                     "\n" +
                     "\"copies\": 6\n" +
                     "\n" +
                     "},\n" +
                     "{\n" +
                     "\n" +
                     "\"title\": \"RPA\",\n" +
                     "\n" +
                     "\"price\": 45,\n" +
                     "\n" +
                     "\"copies\": 10\n" +
                     "\n" +
                     "},\n" +
                     "\n" +
                     "{\n" +
                     "\n" +
                     "\"title\": \"Cypress\",\n" +
                     "\n" +
                     "\"price\": 40,\n" +
                     "\n" +
                     "\"copies\": 4\n" +
                     "\n" +
                     "},\n" +
                     "\n" +
                     "{\n" +
                     "\n" +
                     "\"title\": \"Appium\",\n" +
                     "\n" +
                     "\"price\": 35,\n" +
                     "\n" +
                     "\"copies\": 10\n" +
                     "\n" +
                     "},\n" +
                     "{\n" +
                     "\n" +
                     "\"title\": \"API Automation\",\n" +
                     "\n" +
                     "\"price\": 350,\n" +
                     "\n" +
                     "\"copies\": 10\n" +
                     "\n" +
                     "}\n" +
                     "\n" +
                     "]\n" +
                     "\n" +
                     "}";
         }

         public static String newPayload()
         {

             return "{\n" +
                     "\n" +
                     "\"name\":\"Learn Appium Automation with Java\",\n" +
                     "\"isbn\":\"bcd\",\n" +
                     "\"aisle\":\"227\",\n" +
                     "\"author\":\"John foe\"\n" +
                     "}";

         }
    }


