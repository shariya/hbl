jQuery(document).ready(function ($) {    
    // -------------------------
    // Mobile Search & Menu Toggle
    // -------------------------
    $(".navbar-toggle").click(function() {
        $("#navmenu").toggle();
        $("#vz-search-form").hide();
        $(this).toggleClass("active-btn");
        $(".search-toggle").removeClass("active-btn");
    });

    $(".search-toggle").click(function() {
        $("#vz-search-form").toggle();
        $("#navmenu").hide();
        $(this).toggleClass("active-btn");
        $("button.navbar-toggle").removeClass("active-btn");
    });


    // -------------------------
    //  Search DropDown for Desktop
    // -------------------------  
    $(".inputDropdown").click(function(){
        $(".selectDropdown #search_dropdown").toggle();
        $('body').on("click", closeDropDown);
    });


    $("#search_dropdown ul li a").click(function(){
        $("#search_dropdown,.search_dropdown").show();
        var selectValue = $(this).html();
        $(".inputDropdown input.inputSmall").attr("value",selectValue);
        $("#search_dropdown,.search_dropdown").hide();
    });

    $('body').on("click", closeDropDown);
    function closeDropDown(event) {
        if (!$(event.target).closest('.inputDropdown').length) {
            $("#search_dropdown").hide();
        }
    }

    // -------------------------
    //  Search Auto Suggest Dropdown
    // -------------------------
    $('#search_content').keyup(function() {
        if ($(this).val().length > 1) {
            $('#searchOverlayTop1').show();
        } else {
            $('#searchOverlayTop1').hide();
        }

        $('body').on("click", closeSarchDD);

        function closeSarchDD(event) {
            if (!$(event.target).closest('#searchOverlayTop1').length) {
                $("#searchOverlayTop1").hide();
                $('body').unbind();
            }
        }
    });

});   //document.ready close