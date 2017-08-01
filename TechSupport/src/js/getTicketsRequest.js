var ticketContainer = document.getElementById("ticket-info");
var btn = document.getElementById("btn");

btn.addEventListener("click", function(){
    var ourRequest = new XMLHttpRequest();
    ourRequest.open('GET', 'http://localhost:63342/TechSupport/src/json/Tickets.json');
    ourRequest.onload = function(){
        var ourData = JSON.parse(ourRequest.responseText);
        renderHTML(ourData);
    };
    ourRequest.send();
});

function renderHTML(data){
     var htmlString = "<table>";

    for(i=0; i<data.length; i++){
        htmlString += "<tr><td> Ticket " + (i+1) + ": "+ data[i].id + "<td>";
        htmlString += "<td>/ " + data[i].clientName + "<td>";
        htmlString += "<td>/ " + data[i].clientAddress + "<td>";
        htmlString += "<td>/ " + data[i].clientPhone + "<td>";
        htmlString += "<td>/ " + data[i].visitTime + "<td>";
        htmlString += "<td>/ " + data[i].status + "<td>";
        htmlString += "<td>/ " + data[i].priority + "<td>";
        htmlString += "<td>/ " + data[i].problemType + "<td>";
        htmlString += "<td>/ " + data[i].description + "<td></tr>";
    }

    htmlString += "</table>";
    ticketContainer.insertAdjacentHTML('beforeend', htmlString);
}
