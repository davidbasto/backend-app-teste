const fetch = require('node-fetch');

const webhookURL = 'https://chat.googleapis.com/v1/spaces/AAAA_JcjjEs/messages?key=AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI&token=2c8ZKADWbHQvp0uyz6G88aR8-ee-XZqSLmWJBcEC1Vk%3D';

const dados = require('minimist')(process.argv.slice(2))
const mensagemNotificacao = dados.mensagem;

const data = JSON.stringify({
  'text': mensagemNotificacao,
});

fetch(webhookURL, {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json; charset=UTF-8',
  },
  body: data,
}).then((response) => {
  console.log(response);
});