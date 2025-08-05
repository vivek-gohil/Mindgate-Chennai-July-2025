import json

json_str = '{"name": "Alice", "age": 30}'
data = json.loads(json_str)
print("Name:", data["name"])

print("-" *80)

python_data = {"city": "Mumbai", "temperature": 32}
json_output = json.dumps(python_data)
print(json_output)
