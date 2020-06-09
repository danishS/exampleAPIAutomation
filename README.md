# Example API Automation
- This repo uses RestAssured framework for API tests.
- This repo also has some basic happy-path tests using a public API (Battuta)

## Run Steps
- Make sure maven is installed and in Path
- On cmd/terminal cd into the root directory of the project (or where the pom.xml is placed) and type `mvn clean test -Dapikey=<your api key>`
- This will run four tests.
- Detailed testng results will be saved in `test-output` folder
