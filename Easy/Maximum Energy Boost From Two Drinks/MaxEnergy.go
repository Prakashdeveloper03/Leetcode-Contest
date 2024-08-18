package main

import "fmt"

func maxEnergyBoost(energyDrinkA []int, energyDrinkB []int) int64 {
	n := len(energyDrinkA)
	dp := make([][2]int64, n+5)
	for i := n - 1; i >= 0; i-- {
		dp[i][0] = max(int64(energyDrinkB[i])+dp[i+1][0], dp[i+1][1])
		dp[i][1] = max(int64(energyDrinkA[i])+dp[i+1][1], dp[i+1][0])
	}

	return max(dp[0][0], dp[0][1])
}

func main() {
	var t int
	fmt.Scan(&t)
	for t > 0 {
		t--
		var n int
		fmt.Scan(&n)
		energyDrinkA, energyDrinkB := make([]int, n), make([]int, n)
		for i := 0; i < n; i++ {
			fmt.Scan(&energyDrinkA[i])
		}
		for i := 0; i < n; i++ {
			fmt.Scan(&energyDrinkB[i])
		}
		fmt.Println(maxEnergyBoost(energyDrinkA, energyDrinkB))
	}
}
