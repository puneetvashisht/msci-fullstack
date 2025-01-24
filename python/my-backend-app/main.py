
from fastapi import FastAPI, status, HTTPException
app = FastAPI()


@app.get("/hello")
def hello_world():
    return {"message": f"Hello, World!"}

