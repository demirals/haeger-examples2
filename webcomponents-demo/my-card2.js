import { LitElement, html, css } from "lit-element";


export class MyCard2 extends LitElement {
    constructor() {
        super();
        this.header = 'Dummy';

    }

    static get properties() {
        return {
            header: {type: String, attribute: true}
        }
    }

    static get styles() {
        return css `
            h2 {
                background-color: lightblue;
                margin-top: 0;
            }
            div {
                border: 1px black solid;
                border-radius: 5px;
                width: 400px;
            }
            :host {
                margin: 5px;
            }
        `
    }

    render() {
        return html`
        <div>
            <h2>${this.header}</h2>
            <slot></slot>
        </div>
        `;
    }

}


window.customElements.define('my-card2', MyCard2);