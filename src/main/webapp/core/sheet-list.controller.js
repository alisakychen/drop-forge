'use strict';

angular.module('dropForgeApp').controller('SheetListController', ['$scope', 'CharacterService',
  function($scope, CharacterService) {
    var self = this;
    self.characterList = [];
  
    fetchAllSheets();
  
    function fetchAllSheets(){
      CharacterService.getCharacters().then( function (resp){
         self.characterList = resp.data; 
      });
    }
  }
]);