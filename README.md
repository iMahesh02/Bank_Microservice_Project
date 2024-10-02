# Bank_Microservice_Project

This branch includes Spring Cloud implementation of Configurations

Here we have concluded the integration of Configuration for our app with Spring Cloud,
  1. We have made a webhook in github to load the config files via Config Repo
  2. To create a webhook we have utilized, Hookdeck site
  3. Navigate to the https://console.hookdeck.com/ and follow the steps mentioned there
  4. use this command after you login to hookdeck via a command given by hookdeck `hookdeck listen 8071 Source --cli-path /monitor`
  5. After this on terminal (console) it will give you a source url
  6. Copy this url and paste it in the webhook settings under github
  7. Keep all the settings of webhook as is
