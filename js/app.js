'use strict'
//Preloader
	$(document).ready(function() { 
	preloaderFadeOutTime = 500;
	function hidePreloader() {
	var preloader = $('.preloader_1');
	preloader.fadeOut(preloaderFadeOutTime);
	}
	hidePreloader();
	});