package com.tiy;

public class ClassHTMLTemplate {
    public static final String header =
            "<html>\n" +
                    "<head lang=\"en\">\n" +
                    "\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <title>Vehicle Telemetry</title>\n" +
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
                    "        <td>avgVin</td>\n" +
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
