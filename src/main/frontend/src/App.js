import React, {useEffect, useState} from 'react';
import axios from 'axios';
import {Route, Routes} from "react-router-dom";
import BoardList from "./routes/BoardList";
import Home from "./routes/Home";

function App() {


	const [data, setData] = useState([])

    useEffect(() => {
		axios.get('http://localhost:8080/API/Board/?PAGE_NO=1&ListSize=10&SearchWord=')
		.then(res => {
		    console.log(res.data);
		    setData(res.data);
		})
		.catch(err => console.log(err));
    }, []);

    return (
		<Routes>
		  <Route path="/" element={<Home/>}/>
		  <Route path="/board" element={<BoardList/>}/>
		</Routes>
    );
}

export default App;
