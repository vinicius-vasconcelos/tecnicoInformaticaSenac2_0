import React from 'react';

class AloClass extends React.Component{

    constructor(props){
        super(props)
    }

    nomeCompleto() {
        return `${this.props.nome} ${this.props.sobrenome}`;
    }
    
    render() {
        const style = {
            backgroundColor: this.props.cor,
        }
        return (
            <h2 style={style}> Oi eu sou {this.nomeCompleto()} O BRABO ! </h2>
        );
    }
}

export default AloClass;