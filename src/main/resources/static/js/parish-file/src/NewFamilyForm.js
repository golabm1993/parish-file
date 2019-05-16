import React, {Component} from 'react';
import './AllFamiliesDisplay.css';

class NewFamilyForm extends Component {

    constructor(props) {
        super(props);
        this.state = {
            surname: '',
            address: '',
            phoneNumber: '',
            lastPastoralVisit: ''
        };

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        if (event.target.name === 'surname') {
            this.setState({surname: event.target.value});
        } else if (event.target.name === 'address') {
            this.setState({address: event.target.value});
        } else if (event.target.name === 'phoneNumber') {
            this.setState({phoneNumber: event.target.value});
        } else if (event.target.name === 'lastPastoralVisit') {
            this.setState({lastPastoralVisit: event.target.value});
        }
    }

    handleSubmit(event) {
        event.preventDefault();
        const family = {
            surname: this.state.surname,
            address: this.state.address,
            phoneNumber: this.state.phoneNumber,
            lastPastoralVisit: this.state.lastPastoralVisit
        };

        fetch('http://localhost:8080/family', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(family)
        }).then(() => {
            this.props.addFamily(family);
        });
    }

    render() {
        return (
            <form onSubmit={this.handleSubmit}>
                <label>Surname: <input type="text" name="surname" value={this.state.surname}
                                       onChange={this.handleChange}/></label><br/>
                <label>Address: <input type="text" name="address" value={this.state.address}
                                       onChange={this.handleChange}/></label><br/>
                <label>Phone number: <input type="number" name="phoneNumber" value={this.state.phoneNumber}
                                            onChange={this.handleChange}/></label><br/>
                <label>Last pastoral visit: <input type="date" name="lastPastoralVisit"
                                                   value={this.state.lastPastoralVisit}
                                                   onChange={this.handleChange}/></label><br/>
                <input type="submit" value="Submit"/>
            </form>
        )
    }
}

export default NewFamilyForm;
