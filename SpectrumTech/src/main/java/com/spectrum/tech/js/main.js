var ourRequest = new XMLHttpRequest();
ourRequest.open('GET', '');
ourRequest.onload = function(){
  var ourData = ourRequest.responseText;
  console.log(ourData[0]);
};
ourRequest.send();