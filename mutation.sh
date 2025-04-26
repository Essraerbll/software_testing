rm -rf target/pit-reports      
# Remove-Item -Recurse -Force .\target\pit-reports

mvn clean compile test-compile pitest:mutationCoverage
open target/pit-reports/**/index.html
