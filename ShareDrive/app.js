const id = 10017
const month = 04

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
  const rides = data[0].filter((ride) => ride['driver_id'] == id)
  const payments = data[1]

  console.log('Rides: ', rides)
})
