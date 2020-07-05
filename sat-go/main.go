package main

import (
	"fmt"
	"net/http"
)

func corsmiddleware(res http.ResponseWriter){
	//fmt.Printf("Adding CORS")
	res.Header().Set("Access-Control-Allow-Origin", "http://localhost:9007")
	res.Header().Set("Access-Control-Allow-Methods", "POST, GET, OPTIONS")
	res.Header().Set("Access-Control-Allow-Headers", "X-PINGOTHER, Content-Type")
	res.Header().Set("Access-Control-Max-Age", "8600")
}

func index(w http.ResponseWriter, req *http.Request){
	//fmt.Printf(req.Host)
	buffers()
	corsmiddleware(w)
	fmt.Fprint(w, "Affirmative!")
}

func main(){
	http.HandleFunc("/", index)
	fmt.Printf("Starting server at port 8080\n")
	http.ListenAndServe(":8080", nil)
}