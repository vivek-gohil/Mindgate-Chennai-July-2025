import requests

response = requests.get("https://api.agify.io/?name=Vivek")
if response.status_code == 200:
    data = response.json()
    print(data)
    print("Predicted age:", data["age"])
else:
    print("Failed to fetch data")
