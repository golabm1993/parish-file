import React, {Component} from 'react';
import './AllFamiliesDisplay.css';
import DeleteFamilyButton from "./DeleteFamilyButton";

class AllFamiliesDisplay extends Component {
    constructor(props) {
        super(props);

        this.state = {
            items: [],
        };

        this.remove = this.remove.bind(this);
    }

    componentDidMount() {
        fetch('http://localhost:8080/family')
            .then(response => response.json())
            .then((response) => {
                    this.setState({items: response});
                }
            );
    }

    remove(id) {
        fetch(`http://localhost:8080/family/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            const {items} = this.state;
            let updateGroups = items.filter(i => i.id !== id);
            this.setState({items: updateGroups});
        });
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
                                <DeleteFamilyButton id={hit.id} remove={this.remove}/>
                            </li>
                        )}
                    </ul>
                </header>
            </div>
        )
    }
}

export default AllFamiliesDisplay;
