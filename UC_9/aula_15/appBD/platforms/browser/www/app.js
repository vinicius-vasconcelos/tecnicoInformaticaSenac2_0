(function(){
    let bd = [
        {
            name: 'This Aint A Scene, Its An Arms Race',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/GNm5drtAQXs" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'Centuries',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/LBr7kECsjcQ?start=3" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'Immortals ',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/l9PxOanFjxQ?start=9" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'The Phoenix',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/5hDZbroaQDc?start=10" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'Thnks fr th Mmrs',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/onzL0EM1pKY?start=12" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'Dance, Dance',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/C6MOKXm8x50?start=10" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'This Aint A Scene, Its An Arms Race',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/GNm5drtAQXs?start=31" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'Sugar, Were Goin Down',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/uhG-vLZrb-g?start=15" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        {
            name: 'Beat It',
            url: '<iframe src="https://www.youtube-nocookie.com/embed/sk8Pb17pcQI?start=23" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
            like: false,
        },
        
    ];

    let main = document.getElementById('main');
    let str = '';

    for (let i = 0; i < bd.length; i++) {
        str += `
            <div class="card">
                <h2 class="general-card">${bd[i].name}</h2>
                <div class="iframe">${bd[i].url}</div>
                <div class="general-card"><i class="far fa-heart fa-lg"></i></div>
            </div>
        `
    }

    main.innerHTML = str;


}());