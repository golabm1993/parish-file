import React, {Component} from 'react';
import './AllFamiliesDisplay.css';

class DeleteFamilyButton extends Component {
    constructor(props) {
        super(props);
        this.remove = this.remove.bind(this);
    }

    remove(id) {
        this.props.remove(id);
    }

    render() {
        return (
            <div className="DeleteFamilyButton">
                <button onClick={() => this.remove(this.props.id)}>Delete</button>
            </div>
        )
    }
}

export default DeleteFamilyButton;
