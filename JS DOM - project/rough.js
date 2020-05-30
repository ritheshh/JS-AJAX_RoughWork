console.log(document.URL);
console.log(typeof document.URL);
console.log(document.URL);

var xhr = new XMLHttpRequest();
xhr.open('GET','index.html',true);
xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
xhr.send();

xhr.onload = function() {
    if(this.status == 200) {
        console.log(this.response);
        window.location = this.responseURL
        //document.write(this.response);
        //document.URL = this.responseURL;
    }
}