console.log(document);
console.log(document.domain);
console.log(document.URL);
console.log(document.title); //document.title = 'Can be changed this way!!';
console.log(document.doctype);
console.log(document.body);

console.log(document.all); // Will retun a array of all the nodes present under DOM.
console.log(document.all[7]); // This isn't an ideal way to select things.
// document.all[7].textContent = 'Hello';

console.log(document.forms);



/* GET ELEMENT BY ID*/
var header = document.getElementById('header-title');
console.log(header);
// header.textContent = 'Hello - textContent'; - doesn't pay attention to styling.
// header.innerText = 'Hello - innerText'; - Pays attention to styling.
header.style.borderBottom = 'solid 10px black';



/* GET ELEMENTS BY CLASS NAME*/
var itemList = document.getElementsByClassName('items-group');
console.log(itemList);
for(var i=0; i<itemList.length; i++) {
    itemList[i].style.backgroundColor = 'lightgray';
}



/* QUERY SELECTOR - */
header = document.querySelector('#header-title');
header.style.borderBottom = 'solid 3px gray';

var input = document.querySelector('input');
input.placeholder = 'Enter Item';

var submit = document.querySelector('input[type=submit]');
submit.value = 'GO';

// itemList = document.querySelector('.items-group'); - Query Selector will basically select the first item/node.

lastItemList = document.querySelector('.items-group:last-child');
lastItemList.style.color = 'blue';

nthItemList = document.querySelector('.items-group:nth-child(2)');
nthItemList.style.color = 'red';



/* QUERY SELECTORALL - */
var evenItemList = document.querySelectorAll('li:nth-child(even)');
for(var i=0; i<evenItemList.length; i++) {
    evenItemList[i].style.backgroundColor = 'gray';
}