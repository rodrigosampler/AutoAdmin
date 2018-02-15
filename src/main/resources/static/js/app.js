var appCliente = angular.module("appAuto", [ 'ngRoute' ]);]

appCliente.config(function($routeProvider, $locationProvider) {

	$routeProvider
	.when("/clientes", {
		templateUrl : 'view/cliente.html',
		controller : 'clienteController'
	}).otherwise({
		rediretTo : '/'
	});
	
	$locationProvider.html5Mode(true);
	
});