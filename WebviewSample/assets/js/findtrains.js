var searchBox= function () {    
    console.log("i am here my dear boss")
    $('.search-box').live('click', function(event) {
         $('#search').focus();
     });
    $('#search').keyup(function(event) {
            console.log("key up");
            $(".text-field-cancel-button").show();
            if($(this).attr("value") == '')  
                {  
                    $(".text-field-cancel-button").hide();  
                 } 
            
        var search_text = $('#search').val();
        
        
        var rg= new RegExp('('+$.unique(search_text.split(" ")).join("|")+')',"i");
        console.log(rg);
        $('.stripeMe li').each(function(){
                 
                 if($.trim($(this).text()).search(rg) == -1) {
                $(this).parent().css('display', 'none');
                 $(this).css('display', 'none');
                
                
            }    
            else {
                
                $(this).parent().not('.list-bookmarked').css('display', '');
                $(this).css('display', '');
                $(this).next().not('.list-bookmarked').css('display', '');
                
            }
              
        });
    });
};
 
$('#search_clear').click(function() {
    $('#search').val('');    
     $(".text-field-cancel-button").hide();
    $('.stripeMe li span').each(function(){
        $(this).parent().not('.list-bookmarked').css('display', '');
        $(this).not('.list-bookmarked').css('display', '');
        
        
    });
    
    
    
    
});