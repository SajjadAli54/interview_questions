# ShareDrive

ShareDrive, a new ride sharing service, has recently started its operations in Pakistan. To attract more drivers to their app, they are offering a joining package for drivers. Some of the key features in offer include:

- First month is completely free for drivers
- 10% commission on earnings for the second month i.e if driver is earning 1000 Rs in second month, he will pay 100 rupees to Sharedrive.
- and 20% commission on next months i.e if driver is earning 1000 Rs in next month, he will pay 200 rupees to Sharedrive.

In order to pay back the commission amount to Sharedrive, drivers can pay back any amount via Easypaisa or Jazzcash. All the payments are available in Payments-API below. If the amount paid is more than the required commission amount, It will become part of their balance and can be adjusted later.

ShareDrive requires your help in calculating the total amount that a driver owes or needs to be paid by the company in 2022. You are provided with 2 API endpoints for all the data you need:

<b>Rides API:</b> [https://www.jsonkeeper.com/b/DM5F](https://www.jsonkeeper.com/b/DM5F)

This API will return all the trips in JSON format and each trip contains driver id, fare and trip date that can help you calculate the required commission amount.

Date format is MM/DD/YYYY

Format: JSON. List of trip objects, one object looks like this

```json
{
  "driver_id": 10006,
  "driver_name": "Herman Lowe",
  "trip_rating": 5,
  "trip_details": {
    "distance_km": 4,
    "time_taken": 17,
    "fare": 68,
    "customer_id": "0271707666"
  },
  "trip_date": "05/01/2022",
  "vehicle": {
    "model": "Galant",
    "number": "1G4CU541034935075"
  }
}
```

<b>Payments API</b>: [https://www.jsonkeeper.com/b/9QRZ](https://www.jsonkeeper.com/b/9QRZ)

This API will return all the payments made by the drivers to Sharedrive. Driver id and amount value in each record can help you calculate the total amount that has been paid back to Sharedrive.

Date format is MM/DD/YYYY

Format: JSON. List of payment objects, one object looks like this

```json
{
  "driver_id": 10007,

  "driver_name": "Donnie Saunders",

  "amount": 500,

  "date": "03/21/2022",

  "payment_mode": "JazzCash"
}
```

---

## Limitations (HINT):

- Package will start from 1st of that month, no matter when you join in that month. E-g: Zubair joins on 1st of oct and Ali joins on 20th of Oct, first month will expire on on 31-Oct 11:59 for both drivers
- All the dates will be in 2022. You can just check the month part instead of going for a full date comparison.
- Date format is MM/DD/YYYY

---

## Input Format

The input will be read from a file. The filename/path will be passed to your program as the first command-line argument. First line of input will be an integer T representing the number of test cases. Each test case contains a comma separated driver ID and Joining date of the driver.

---

## Output Format

Output will be the amount that needs to be paid by Driver or by Company. Amount driver needs to pay will be negative. Format your output to fixed 1 decimal places.

## Sample Test Case Input

2
10017, 04/01/2022
10017, 01/01/20200

## Sample Test Case Output

9634.4
-825.0
