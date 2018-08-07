angular.module('MonApp', [])

    .controller('Controleur1', function($scope,$http) {
        $scope.motCle=null;
        $scope.pageCourante=0;

        function rafraichirLeTableau(){
            $http.get('rest/managers/totalManagers').then(function(data){
                $scope.managers = data.data;
            })
                $http.get('rest/domains/totalDomains').then(function(data){
                $scope.domains = data.data;
                })
            $http.get('rest/nessies/totalNessies').then(function(data){
                $scope.nessies = data.data;
            })

            $http.get('rest/stakeholders/totalStake').then(function(data){
                $scope.stakeholders = data.data;
            })
            $http.get('rest/projects/totalProject').then(function(data) {
                $scope.projects = data.data;
            })
            $http.get('rest/ressources/totalRes').then(function(data) {
                $scope.ressources = data.data;
            })
       };
        $scope.sort = function(keyname){
            $scope.sortKey = keyname;   //set the sortKey to the param passed
            $scope.reverse = !$scope.reverse; //if true make it false and vice versa
        }

        $scope.validerEdition = function(){
            $http.post('rest/managers/validerEdition/',$scope.manager).then(function(data){
                alert('Updated');
                rafraichirLeTableau();
            })

        }


        $scope.validerEditionDomain = function() {
            $http.post('rest/domains/validerEditionDomain/',$scope.domain).then(function(data){
                alert('Domain Updated');

                rafraichirLeTableau();
            })
        }
        $scope.validerEditionNessie = function() {
            $http.post('rest/nessies/validerEditionNessie/',$scope.nessie).then(function(data){
                alert('Nessie Updated');

                rafraichirLeTableau();
            })
        }

        $scope.validerEditionStake = function() {
            $http.post('rest/stakeholders/validerEditionStake/',$scope.stake).then(function(data){
                alert('StakeHolders Updated');

               rafraichirLeTableau();
          })
        }
        $scope.validerEditionProject = function() {
            $http.post('rest/projects/validerEditionProject/',$scope.project).then(function(data){
                alert('project  Updated');

                rafraichirLeTableau();
            })
        }
        $scope.editer = function(manager){
            $http.get('rest/managers/getManagerParId/'+manager.pm_id).then(function(data){
                $scope.manager = data.data;
            })
        }
        $scope.editerDomain = function (domain) {
            $http.get('rest/domains/getDomainParId/'+domain.d_id).then(function(data){
                $scope.domain= data.data;


            })

        }
        $scope.editerNessie = function(nessie) {
            $http.get('rest/nessies/getNessieParId/' + nessie.ne_id).then(function (data) {
                $scope.nessie = data.data;
            })
        }
        $scope.editerStake = function(stake) {
            $http.get('rest/stakeholders/getStakeParId/' + stake.st_id).then(function (data) {
                $scope.stake = data.data;
            })
        }
        $scope.editerProject = function(project) {
            $http.get('rest/projects/getProjectParId/' + project.id_interne).then(function (data) {
                $scope.project = data.data;
            })
        }

        $scope.ajouter = function(){
            $http.post('rest/managers/ajouterManager/',$scope.nouvelManager).then(function(data){
                alert('inserted');
                rafraichirLeTableau();
            })
        }

        $scope.ajouterDomain = function () {
            $http.post('rest/domains/ajouterDomain',$scope.nouvelDomain).then(function (data) {
                alert('inserted');
                rafraichirLeTableau();

            })

        }
        $scope.ajouterNessie = function(){
            $http.post('rest/nessies/ajouterNessie/',$scope.nouvelNessie).then(function(data){
                alert('inserted');
                rafraichirLeTableau();
            })
        }
        $scope.ajouterStake = function(){
            $http.post('rest/stakeholders/ajouterStake/',$scope.nouvelStake).then(function(data){
                alert('inserted');
                rafraichirLeTableau();
            })
        }
        $scope.ajouterProject = function(){
            $http.post('rest/projects/ajouterProject/',$scope.nouvelProject).then(function(data){
                alert('inserted');
                rafraichirLeTableau();
            })
        }

        $scope.supprimerDomain = function () {
            $http.get('rest/domains/supprimerDomainParId'+domain.d_id).then(function(data){
                alert('deleted');
                rafraichirLeTableau();
            })

        }
        $scope.supprimerNessie = function () {
            $http.get('rest/nessies/supprimerNessieParId'+nessie.ne_id).then(function(data){
                alert('deleted');
                rafraichirLeTableau();
            })

        }
        $scope.supprimer = function () {
            $http.get('rest/managers/supprimerManagerParId'+manager.pm_id).then(function(data){
                alert('deleted');
                rafraichirLeTableau();
            })
        }
        $scope.supprimerStake = function () {
            $http.get('rest/stakeholders/supprimerStakeParId'+stake.st_id).then(function(data){
                alert('deleted');
                rafraichirLeTableau();
            })
        }
        rafraichirLeTableau();

        $scope.clearInfo = function(){
            $scope.info = "";
        };
        $scope.charger=function () {
            $http.get("/domainParMC?mc="+$scope.motCle+"$page="+$scope.pageCourante)
                .succes(function(data) {
                    $scope.domains = data;
                    $scope.pages = new Array(data.totalPages);
                });


        };
    });