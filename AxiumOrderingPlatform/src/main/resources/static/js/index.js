var addPropertyApp = angular.module("addIPUFile", ['ui.bootstrap']);

		function addIPUFilecontroller($scope, $filter, $http) {
			
			
			    $scope.filteredItems = [];
			    $scope.groupedItems = [];
			    $scope.itemsPerPage = 50;
			    $scope.pagedItems = [];
			    $scope.currentPage = 0;
			    $http({
			        method : "GET",
			        url : "http://localhost:8080/api"
			    }).then(function mySuccess(response) {
			    	$scope.items = response.data;
			    }, function myError(response) {
			        $scope.myWelcome = response.statusText;
			    });

				
			    var searchMatch = function (haystack, needle) {
			        if (!needle) {
			            return true;
			        }
			        return haystack.toString().toLowerCase().indexOf(needle.toLowerCase()) !== -1;
			    };

			    // init the filtered items
			    $scope.search = function () {
			    	console.log($scope.query);
			        $scope.filteredItems = $filter('filter')($scope.items, function (item) {
			            for(var attr in item) {
			                if (searchMatch(item[attr], $scope.query))
			                    return true;
			            }
			            return false;
			        });
			        // take care of the sorting order
			        if ($scope.sortingOrder !== '') {
			            $scope.filteredItems = $filter('orderBy')($scope.filteredItems);
			        }
			        $scope.currentPage = 0;
			        // now group by pages
			        $scope.groupToPages();
			    };
			    
			    // calculate page in place
			    $scope.groupToPages = function () {
			        $scope.pagedItems = [];
			        
			        for (var i = 0; i < $scope.filteredItems.length; i++) {
			            if (i % $scope.itemsPerPage === 0) {
			                $scope.pagedItems[Math.floor(i / $scope.itemsPerPage)] = [ $scope.filteredItems[i] ];
			            } else {
			                $scope.pagedItems[Math.floor(i / $scope.itemsPerPage)].push($scope.filteredItems[i]);
			            }
			        }
			    };
			    
			    $scope.range = function (start, end) {
			        var ret = [];
			        if (!end) {
			            end = start;
			            start = 0;
			        }
			        for (var i = start; i < end; i++) {
			            ret.push(i);
			        }
			        return ret;
			    };
			    
			    $scope.prevPage = function () {
			        if ($scope.currentPage > 0) {
			            $scope.currentPage--;
			        }
			    };
			    
			    $scope.nextPage = function () {
			        if ($scope.currentPage < $scope.pagedItems.length - 1) {
			            $scope.currentPage++;
			        }
			    };
			    
			    $scope.setPage = function () {
			        $scope.currentPage = this.n;
			    };

			    // functions have been describe process the data for display
			    $scope.search();

			    // change sorting order
			
			    
			    $scope.sort_items = function() {
			        $scope.filteredItems = $filter('orderBy')($scope.filteredItems);
			        $scope.groupToPages();
			    };
			};
			addIPUFilecontroller.$inject = ['$scope', '$filter'];
				