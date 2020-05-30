/* PARENT NODE */
var items = document.querySelector('#items');
console.log(items);
console.log(items.parentNode);
//items.parentNode.parentNode.style.backgroundColor = 'lightgray';



/* PARENT ELEMENT - similar to parent node*/
// var items = document.querySelector('#items');
// console.log(items);
// console.log(items.parentElement);
// items.parentElement.parentElement.style.backgroundColor = 'lightgray';



/* CHILD NODE & CHILDREN */
var items = document.querySelector('#items');
console.log(items.childNodes); // Not recommended to use, as it gives a NodeList of items which also contains line breaks as Nodes which is useless and disturbing.

console.log(items.children); // Should be used instead of childNodes. Gives collection of elements inside the tag.



/* FIRST CHILD - NOT RECOMMENDED */
console.log(items.firstChild); // Get the first child of the childNode - which is useless.



/* FIRST & LAST ELEMENT CHILD */
console.log(items.firstElementChild);
console.log(items.lastElementChild);
items.lastElementChild.textContent = 'Last Element Child';

/* NEXT & PREVIOUS ELEMENT SIBLING */
console.log(items.previousElementSibling);
items.previousElementSibling.style.color = 'rgb(255, 112, 153)';



/* CREATE A NEW DIV */
var newDiv = document.createElement('div');
newDiv.id = 'idNewDiv';
newDiv.className = 'classNewDiv';

var textForNewDiv = document.createTextNode('New Text is written here.');

newDiv.appendChild(textForNewDiv);

var headerContainer = document.querySelector('header div'); // querySelector('#header-container');
console.log(headerContainer);
var headerTitle = document.querySelector('header h1'); // querySelector('#header-title');

headerContainer.insertBefore(newDiv, headerTitle);
console.log(newDiv);
