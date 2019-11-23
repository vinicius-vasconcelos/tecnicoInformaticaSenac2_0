import React from 'react';
import './Main.css';

class Main extends React.Component {

    constructor(props) {
        super(props);
        this.state = { result: '' };
    }

    calcular = (event) => {
        event.preventDefault();
        //alert(parseInt(this.state.v1) + parseInt(this.state.v2));
        this.setState({ result: parseInt(this.state.v1) + parseInt(this.state.v2) });
    }

    v1 = (event) => {
        this.setState({ v1: event.target.value });
    }

    v2 = (event) => {
        this.setState({ v2: event.target.value });
    }

    render() {
        return (
            <main className="principal">
                <form className="form" onSubmit={this.calcular}>
                    <h2>Olá Posso Somar ?</h2>
                    <input type="text" onChange={this.v1} className="input" placeholder="Entre com um valor 1..." />
                    <input type="text" onChange={this.v2} className="input" placeholder="Entre com um valor 2..." />

                    <p>Resultado: {this.state.result}</p>

                    <button className="btn" type='submit'> Somar</button>
                </form>
            </main>
        )
    }
}

export default Main;