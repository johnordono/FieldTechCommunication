var ticketContainer = document.getElementById("ticket-info");
var btn = document.getElementById("btn");
var tech = document.getElementById("tech");

btn.addEventListener("click", function(){
    var ourRequest = new XMLHttpRequest();
    ourRequest.open('GET', 'http://localhost:63342/TechSupport/src/json/Tickets.json');
    ourRequest.onload = function(){
        var ourData = JSON.parse(ourRequest.responseText);
        renderHTML(ourData, tech);
    };
    ourRequest.send();
});

function renderHTML(data, tech){
     var htmlString = "<table>";

    for(i=0; i<data.length; i++){
        //if(data[i].id == tech){
            htmlString += "<tr><td> Ticket " + (i+1) + ": "+ data[i].id + "<td>";
            htmlString += "<td>/ " + data[i].clientName + "<td>";
            htmlString += "<td>/ " + data[i].clientAddress + "<td>";
            htmlString += "<td>/ " + data[i].clientPhone + "<td>";
            htmlString += "<td>/ " + data[i].visitTime + "<td>";
            htmlString += "<td>/ " + data[i].status + "<td>";
            htmlString += "<td>/ " + data[i].priority + "<td>";
            htmlString += "<td>/ " + data[i].problemType + "<td>";
            htmlString += "<td>/ " + data[i].description + "<td></tr>";

        //}
    }

    htmlString += "</table>";
    ticketContainer.insertAdjacentHTML('beforeend', htmlString);
}