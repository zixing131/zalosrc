function setContentErrorPage(description, stringUrl){
//  alert("Page Error!!!" + "&nbsp;&nbsp; Cannot redirect link : " + stringUrl + "<br />" + "&nbsp;&nbsp; With error : " + description);
  document.getElementById("content_page").innerHTML = "&nbsp;&nbsp; Cannot redirect link : <a href=\""+ stringUrl +"\" > " + stringUrl + " </a> <br /> <br />" + "&nbsp;&nbsp; With error : " + description;
}
