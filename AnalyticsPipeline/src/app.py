from flask import Flask

app = Flask(__name__)

@app.route('/')
def gatherData:
    return "Hello World! I am doing my job!!"
