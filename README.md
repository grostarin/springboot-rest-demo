# Springboot REST demo

When running, swagger is available : http://localhost:8080/swagger-ui

## Debug

VM Args have to be added 

```json
-Dspring.profiles.active=dev -Dspring.config.location=<PATH_TO_PROJECT>/springboot-rest-demo-config/src/main/resources/springboot-rest-demo.yml
```

### On VSCode

```json
        {
            "type": "java",
            "name": "Launch OneyApp",
            "request": "launch",
            "mainClass": "com.oney.prdlgcl.demorest.OneyApp",
            "projectName": "demo-rest-ws",
            "vmArgs": "-Dspring.profiles.active=dev -Dspring.config.location=<PATH_TO_PROJECT>\\springboot-rest-demo-config\\src\\main\\resources\\springboot-rest-demo.yml"
        }
```