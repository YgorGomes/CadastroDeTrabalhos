

$('#collapse-navbar').on('show.bs.collapse', function(){
    $('.topCasaFina-banner').css('transform', 'translate(-50%, 18%)')
});

$('#collapse-navbar').on('hide.bs.collapse', function(){
    $('.topCasaFina-banner').css('transform', 'translate(-50%, -50%)')
});

/* script para efeito rolar */
$(function(){
  $("ul a").click(function (event) {
    event.preventDefault();
    var idElemento = $(this).attr("href");
    var deslocamento = $(idElemento).offset().top;
    $('html, body').animate({ scrollTop: deslocamento }, 'slow');
  });
});