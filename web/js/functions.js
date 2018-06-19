function animate(type) {
  var animationClass = ' ' + type + ' animated';
  $('.start').addClass(animationClass).one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', function(){
    $(this).removeClass(animationClass).addClass(' hidden');
  });
}

$(document).ready(function(){
  $('.js--triggerAnimation').click(function(e){
    e.preventDefault();
  // var animation = 'div-left slideInLeft';
    animate('zoomOutUp');
  });

  $('.js--animations').change(function(){
   // var animation = $(this).val();
    animate('zoomOutUp');
  });
});
