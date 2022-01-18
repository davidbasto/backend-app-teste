#!/bin/bash
echo "Undeploy old war"
curl -S -H "content-Type: application/json" -d '{"operation":"undeploy", "address":[{"deployment":"backend-template-api.war"}]}' --digest -u "admin:Admin#70365" http://localhost:9990/management
echo ""

echo "Remove old war"
curl -S -H "content-Type: application/json" -d '{"operation":"remove", "address":[{"deployment":"backend-template-api.war"}]}' --digest -u "admin:Admin#70365" http://localhost:9990/management
echo ""

echo "Upload new war"
bytes_value=`curl -F "file=@backend-template-api/target/backend-template-api.war" --digest -u "admin:Admin#70365" http://localhost:9990/management/add-content | perl -pe 's/^.*"BYTES_VALUE"\s*:\s*"(.*)".*$/$1/'`
echo $bytes_value

json_string_start='{"content":[{"hash": {"BYTES_VALUE" : "'
json_string_end='"}}], "address": [{"deployment":"backend-template-api.war"}], "operation":"add", "enabled":"true"}'
json_string="$json_string_start$bytes_value$json_string_end"

echo "Deploy new war"
result=`curl -S -H "Content-Type: application/json" -d "$json_string" --digest -u "admin:Admin#70365" http://localhost:9990/management | perl -pe 's/^.*"outcome"\s*:\s*"(.*)".*$/$1/'`
echo $result

if [ "$result" != "success" ]; then
  exit -1
fi