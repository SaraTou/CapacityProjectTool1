angular.module('MonApp', [])

    .controller('Controleur1', function($scope,$http) {

        function rafraichirLeTableau(){
            $http.get('rest/managers/totalManagers').then(function(data){
                $scope.managers = data.data;
            })
                $http.get('rest/domains/totalDomains').then(function(data){
                $scope.domains = data.data;
                })
       };

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

        $scope.supprimerDomain = function () {
            $http.get('rest/domains/supprimerDomainParId'+domain.d_id).then(function(data){
                alert('deleted');
                rafraichirLeTableau();
            })

        }

        rafraichirLeTableau();
    });