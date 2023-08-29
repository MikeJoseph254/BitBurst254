// JavaScript for image slideshow
$(document).ready(function () {
    $('.carousel').slick({
        dots: true,
        infinite: true,
        speed: 500,
        fade: true,
        cssEase: 'linear'
    });
});

// JavaScript for smooth scrolling
$(document).ready(function () {
    $('.links a').on('click', function (e) {
        if (this.hash !== '') {
            e.preventDefault();
            
            const hash = this.hash;
            
            $('html, body').animate({
                scrollTop: $(hash).offset().top
            }, 800);
        }
    });
});

// JavaScript for modal
document.addEventListener('DOMContentLoaded', function() {
    const modal = document.getElementById('modal');
    const openModalBtn = document.getElementById('openModalBtn');
    const closeModalBtn = document.getElementById('closeModalBtn');
    
    openModalBtn.addEventListener('click', function() {
        modal.style.display = 'block';
    });
    
    closeModalBtn.addEventListener('click', function() {
        modal.style.display = 'none';
    });
});