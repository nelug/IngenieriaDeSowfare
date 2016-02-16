"use strict";

new Vue({
   el: '#app',

   data: {
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
      }
   }
});
