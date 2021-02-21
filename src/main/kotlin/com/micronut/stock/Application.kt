package com.micronut.stock

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.micronut.stock")
		.start()
}

