import requests
import zipfile
URL = "https://eternallybored.org/misc/netcat/netcat-win32-1.11.zip"
response = requests.get(URL)
open("hari.zip", "wb").write(response.content)

with zipfile.ZipFile(('C:\\Users\\student\\Desktop\\guru\\hari.zip'), 'r') as zip_ref:
    zip_ref.extractall('diva_zip')