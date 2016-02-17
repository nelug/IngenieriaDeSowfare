"use strict";

new Vue({
   el: '#app',

   data: {
      search:"",
      titulo: "WS Api RestFul Tarea 1",
      ResponseJson: []
   },

   ready: function() {
      this.responseHTTP();
   },

   methods: {
      responseHTTP: function() {
         this.$http.get('/UMGRestFull-1.0/v1/universidad').then(function (response) {
            this.$set('ResponseJson', response); 
         });
      },

      responseExternalHTTP: function() {
         this.$http.get('/resultados/ficha/fichas_json.pl?q='+this.search).then(function (response) {
            this.$set('ResponseJson', response); 
         });
      },

      verDataResquest: function() {
         this.ResponseJson = this.ResponseJson.data;
      }
   }
});
