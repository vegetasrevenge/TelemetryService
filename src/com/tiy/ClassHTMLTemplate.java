package com.tiy;

public class ClassHTMLTemplate {
    public static final String header =
            "<html>\n" +
                    "<head lang=\"en\">\n" +
                    "\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <title>Vehicle Telemetry</title>\n" +
                    "    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n" +
                    "    <style>\n" +
                    "\n" +
                    "    body {\n" +
                    "    display: flex;\n" +
                    "    flex-flow: row;\n" +
                    "    font-family: 'Open Sans', sans-serif;\n" +
                    "    background-color: grey;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    table {\n" +
                    "    text-align: center;\n" +
                    "    margin: 0 auto;\n" +
                    "    background-color: black;\n" +
                    "    color: white;\n" +
                    "    }\n" +
                    "</style>\n" +
                    "\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "<table>\n" +
                    "    <tr>\n" +
                    "        <th>VIN</th>\n" +
                    "        <th>Odometer</th>\n" +
                    "        <th>Gas Consumed (in gallons)</th>\n" +
                    "        <th>Oil Change Mileage</th>\n" +
                    "        <th>Engine Size</th>\n" +
                    "    </tr>";

    public static final String avgRow =
            "<tr>\n" +
                    "        <td>N/A</td>\n" +
                    "        <td>avgOdometer</td>\n" +
                    "        <td>avgGas</td>\n" +
                    "        <td>avgOil</td>\n" +
                    "        <td>avgEngine</td>\n" +
                    "    </tr>";

    public static final String currentRow =
            "<tr>\n" +
                    "        <td>vin</td>\n" +
                    "        <td>odometer</td>\n" +
                    "        <td>gas</td>\n" +
                    "        <td>oil</td>\n" +
                    "        <td>engine</td>\n" +
                    "    </tr>";

    public static final String footer =
            "</table>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>";
}
