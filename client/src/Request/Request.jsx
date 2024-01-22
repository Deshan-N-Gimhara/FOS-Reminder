import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import RequestTop from "./Rcomponents/RequestTop";

function Rpage() {
  return (
    <div className='bg-gradient-to-t from-yellow-700 to-yellow-400'>
      <Header />
      <Rtop />
      <Footer />
    </div>
  );
}

export default Rpage;
