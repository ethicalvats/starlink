from flask import Flask
from flask_cors import cross_origin


app = Flask(__name__)


@app.route('/')
@cross_origin(origin="http://localhost:9007")
def hello_world():
    return 'Affirmative!'


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000, debug=True)
