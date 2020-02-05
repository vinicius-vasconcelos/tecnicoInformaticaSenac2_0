// Initialize app
var myApp = new Framework7();


// If we need to use custom DOM library, let's save it to $$ variable:
var $$ = Dom7;

// Add view
var mainView = myApp.addView('.view-main', {
    // Because we want to use dynamic navbar, we need to enable it for this view:
    dynamicNavbar: true
});

// Handle Cordova Device Ready Event
$$(document).on('deviceready', function () {
    console.log("Device is ready!");
});


// Now we need to run the code that will be executed only for About page.

// Option 1. Using page callback for page (for "about" page in this case) (recommended way):
/*myApp.onPageInit('about', function (page) {
    // Do something here for "about" page

})*/

// Option 2. Using one 'pageInit' event handler for all pages:
$$(document).on('pageInit', function (e) {
    // Get page data from event data
    var page = e.detail.page;

    if (page.name === 'about') {
        // Following code will be executed for page with data-page attribute equal to "about"
        myApp.alert('Social App se apresenta aqui !');
    }

    if (page.name === 'feed') {
        // Following code will be executed for page with data-page attribute equal to "about"
        // myApp.alert('feed mlk');
        
        for (let i = 1; i < 9; i++) {

           $$('.page-content').append(`
            <div class="content-block">       
                    <div class="card demo-facebook-card">
                        <div class="card-header">
                            <div class="demo-facebook-avatar"><img src="./img/lindo8.jfif" width="34" height="34"/></div>
                            <div class="demo-facebook-name">John Doe</div>
                            <div class="demo-facebook-date">Monday at 3:47 PM</div>
                        </div>
                        <div class="card-content"> <img src="./img/lindo${i}.jpg" width="100%"/></div>
                        <div class="card-footer"><a href="#" class="link"><i class="far fa-heart fa-lg"></i></a><a href="#" class="link"><i class="far fa-comment fa-lg"></i></a><a href="#" class="link"><i class="far fa-share-square fa-lg"></i></a></div>
                    </div>
                </div>
            `)
        }
    }
})

// Option 2. Using live 'pageInit' event handlers for each page
/*$$(document).on('pageInit', '.page[data-page="about"]', function (e) {
    // Following code will be executed for page with data-page attribute equal to "about"
    myApp.alert('Social App se apresenta aqui !');
})*/