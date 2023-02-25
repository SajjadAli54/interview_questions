const id = 10017
const month = `04`

function getMonth(date) {
  return date.substr(0, 2)
}
const https = require('https')
function get(url) {
  return new Promise((resolve, reject) => {
    https
      .get(url, (resp) => {
        let data = ''
        resp.on('data', (chunk) => {
          data += chunk
        })
        resp.on('end', () => {
          resolve(JSON.parse(data))
        })
      })
      .on('error', (err) => {
        reject(err)
      })
  })
}

const ridesUrl = 'https://www.jsonkeeper.com/b/DM5F'
const paymentsUrl = 'https://www.jsonkeeper.com/b/9QRZ'
const ridesPromise = get(ridesUrl)
const paymentsPromise = get(paymentsUrl)
Promise.all([ridesPromise, paymentsPromise]).then((data) => {
  const riders = data[0].filter((rider) => rider['driver_id'] == id)
  const payments = data[1].filter((rider) => rider['driver_id'] == id)

  const obj = {}
  riders.forEach((rider) => {
    const month = getMonth(rider['trip_date'])
    if (month in obj) obj[month] += rider['trip_details']['fare']
    else obj[month] = rider['trip_details']['fare']
  })

  payments.forEach((payment) => {
    const month = getMonth(payment['date'])
    if (month in obj) obj[month] += payment['amount']
    else obj[month] = payment['amount']
  })

  const keys = Object.keys(obj).sort()
  let payable = 0.0
  let total = 0.0
  let indx = 1
  if (keys.length > indx) {
    total = obj[keys[indx++]]
    payable = 0.1 * total
  }

  while (indx < keys.length) {
    total += obj[keys[indx]]
    payable += 0.2 * obj[keys[indx++]]
  }

  console.log(`Payable: ${total - payable}`)
})
