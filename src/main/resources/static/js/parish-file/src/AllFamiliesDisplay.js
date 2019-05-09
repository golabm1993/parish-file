import React, {Component} from 'react';
import './AllFamiliesDisplay.css';

class AllFamiliesDisplay extends Component {
    constructor(props) {
        super(props);

        this.state = {
            items: [],
        };
    }

    componentDidMount() {
        fetch('http://localhost:8080/family')
            .then(response => response.json())
            .then((response) => {
                    this.setState({items: response});
                }
            );
    }

    render() {
        const {items} = this.state;
        return (
            <div className="AllFamiliesDisplay">
                <header className="AllFamiliesDisplay-header">
                    <ul>
                        {items.map(hit =>
                            <li key={hit.id}>
                                Surname: {hit.surname}<br/>
                                Address: {hit.address}<br/>
                                Phone number: {hit.phoneNumber}<br/>
                                Last pastoral visit: {hit.lastPastoralVisit}
                            </li>
                        )}
                    </ul>
                </header>
            </div>
        )
    }
}

export default AllFamiliesDisplay;
