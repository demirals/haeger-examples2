export class MyCard extends HTMLElement {

    constructor() {
        super();

        let shadow = this.attachShadow({mode: 'open'});
        let card = document.createElement('div');

        let style = document.createElement('link');
        style.rel='stylesheet';
        style.href='my-card.css';
        shadow.appendChild(style);

        this.cardHeader = document.createElement('h2')
        this.cardHeader.innerHTML='Eine feste Überschrift';
        this.cardHeader.className='colored-header';

        let cardBody = document.createElement('slot');
        

        card.appendChild(this.cardHeader);
        card.appendChild(cardBody);
        shadow.appendChild(card);
    }

    static get observedAttributes() {
        return ['header'];
    }

    attributeChangedCallback(attribute, oldValue, newValue) {
        if(attribute === 'header') {
            this.cardHeader.innerHTML=newValue;
        }
    }

}

window.customElements.define('my-card', MyCard)