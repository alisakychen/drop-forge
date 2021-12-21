'use strict';

angular.module('dropForgeApp').factory('CharacterService', ['$http',
  function($http) {
    
    
    return {
     getCharacters: getCharacters
       
    }
    
    function getCharacters (){
        return $http.get('characters/');
    }
    
//    return $resource('sheet/characters/', {}, {
//      query: {
//        method: 'GET',
//        params: {characterId: 'characters'},
//        isArray: true
//      }
//    });
  }
]);
