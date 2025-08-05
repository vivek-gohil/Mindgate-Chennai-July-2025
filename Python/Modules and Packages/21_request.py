# pip install requests

import requests

response = requests.get("https://api.github.com")
print(response)
print("Status Code:", response.status_code)

