import React, {Component} from 'react';
import './AllFamiliesDisplay.css';
import DeleteFamilyButton from "./DeleteFamilyButton";
import NewFamilyForm from "./NewFamilyForm";

class AllFamiliesDisplay extends Component {
    constructor(props) {
        super(props);

        this.state = {
            familyList: [],
        };

        this.remove = this.remove.bind(this);
        this.addFamily = this.addFamily.bind(this);
    }

    componentDidMount() {
        fetch('http://localhost:8080/family')
            .then(response => response.json())
            .then((response) => {
                    this.setState({familyList: response});
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
            const {familyList} = this.state;
            let updateGroups = familyList.filter(i => i.id !== id);
            this.setState({familyList: updateGroups});
        });
    }

    addFamily(family) {
        this.setState({familyList:this.state.familyList.concat([family])});
    }

    render() {
        const {familyList} = this.state;
        return (
            <div className="AllFamiliesDisplay">
                <header className="AllFamiliesDisplay-header">
                    <NewFamilyForm addFamily={this.addFamily}/>
                    <ul>
                        {familyList.map(hit =>
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
