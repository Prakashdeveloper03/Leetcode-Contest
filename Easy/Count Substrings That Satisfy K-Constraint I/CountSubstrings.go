package main

import "fmt"

func countKConstraintSubstrings(s string, k int) int {
	var n int = len(s)
	var result int = 0
	for i := 0; i < n; i++ {
		var count0, count1 int = 0, 0
		for j := i; j < n; j++ {
			if s[j] == '0' {
				count0++
			} else {
				count1++
			}
			if count0 <= k || count1 <= k {
				result++
			} else {
				break
			}
		}
	}
	return result
}

func main() {
	var t int
	fmt.Scan(&t)
	for t > 0 {
		t--
		var n int
		fmt.Scan(&n)
		var s string
		fmt.Scan(&s)
		var k int
		fmt.Scan(&k)
		fmt.Println(countKConstraintSubstrings(s, k))
	}
}
