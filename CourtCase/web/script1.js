


const app = document.getElementById('root')


const container = document.createElement('div')
container.setAttribute('class', 'container')


app.appendChild(container)

var request = new XMLHttpRequest()
request.open('GET', 'https://newsapi.org/v2/top-headlines?country=in&apiKey=fa6045c9ad544d18b6d6b4535ba11180', true)
request.onload = function () {
    // Begin accessing JSON data here
    var data = JSON.parse(this.response)
    if (request.status >= 200 && request.status < 400) {
        data.articles.forEach(movie => {
            const card = document.createElement('div')
            card.setAttribute('class', 'card')

            const h1 = document.createElement('h1')
            h1.textContent = movie.title

            const p = document.createElement('p')
            movie.description = movie.description.substring(0, 300)
            p.textContent = `${movie.description}...`

            container.appendChild(card)
            card.appendChild(h1)
            card.appendChild(p)
        })
    } else {
        const errorMessage = document.createElement('marquee')
        errorMessage.textContent = `Gah, it's not working!`
        app.appendChild(errorMessage)
    }
}

request.send()



/*------------------------slider-----------------------------*/


var bool = false;
if(bool===false){
    init();
}

document.querySelector('.judge').addEventListener('click',function(){
    document.querySelector('.main-bar').style.display='block';
    document.querySelector('.judge-info').style.display='block';
    document.querySelector('.cause-list-info').style.display='none';
    document.querySelector('.display-board-info').style.display='none';
    document.querySelector('.judgement-info').style.display='none';
    document.querySelector('.indian-law-report-info').style.display='none';
    document.querySelector('.lawyers-info').style.display='none';
})

document.querySelector('.course-list').addEventListener('click',function(){
    document.querySelector('.main-bar').style.display='block';
    document.querySelector('.judge-info').style.display='none';
    document.querySelector('.cause-list-info').style.display='block';
    document.querySelector('.display-board-info').style.display='none';
    document.querySelector('.judgement-info').style.display='none';
    document.querySelector('.indian-law-report-info').style.display='none';
    document.querySelector('.lawyers-info').style.display='none';
})

document.querySelector('.display-board').addEventListener('click',function(){
    document.querySelector('.main-bar').style.display='block';
    document.querySelector('.judge-info').style.display='none';
    document.querySelector('.cause-list-info').style.display='none';
    document.querySelector('.display-board-info').style.display='block';
    document.querySelector('.judgement-info').style.display='none';
    document.querySelector('.indian-law-report-info').style.display='none';
    document.querySelector('.lawyers-info').style.display='none';
})

document.querySelector('.judgement').addEventListener('click',function(){
    document.querySelector('.main-bar').style.display='block';
    document.querySelector('.judge-info').style.display='none';
    document.querySelector('.cause-list-info').style.display='none';
    document.querySelector('.display-board-info').style.display='none';
    document.querySelector('.judgement-info').style.display='block';
    document.querySelector('.indian-law-report-info').style.display='none';
    document.querySelector('.lawyers-info').style.display='none';
})

document.querySelector('.indian-law-report').addEventListener('click',function(){
    document.querySelector('.main-bar').style.display='block';
    document.querySelector('.judge-info').style.display='none';    
    document.querySelector('.cause-list-info').style.display='none';
    document.querySelector('.display-board-info').style.display='none';
    document.querySelector('.judgement-info').style.display='none';
    document.querySelector('.indian-law-report-info').style.display='block';
    document.querySelector('.lawyers-info').style.display='none';
})


function init() {
    document.querySelector('.main-bar').style.display='block';
    document.querySelector('.judge-info').style.display='none';
    document.querySelector('.cause-list-info').style.display='none';
    document.querySelector('.display-board-info').style.display='none';
    document.querySelector('.judgement-info').style.display='none';
    document.querySelector('.indian-law-report-info').style.display='none';
    document.querySelector('.lawyers-info').style.display='block';
    
}
