import React from 'react';
import ReactDOM from 'react-dom';
//import AloFunc from './AloFunc'
import AloClass from './AloClass';

var no = prompt('Nome ?');
var so = prompt('Sobrenome ?');
var co = prompt('Cor favorita ?');

ReactDOM.render(<AloClass nome = {no.toLocaleUpperCase()} sobrenome = {so.toLocaleUpperCase()} cor = {co} />, document.getElementById('root'));
