//
//  PrimeFactorer.swift
//  PrimeFactors
//
//  Created by dteng on 7/15/14.
//  Copyright (c) 2014 dteng. All rights reserved.
//

import Foundation

struct PrimeFactorer {
    static func generate(n: Int) -> ([Int]) {
        var list = [Int]()
        var number = n
        
        for var target = 2 ; number > 1 ; target++ {
            for ; number % target == 0 ; number /= target {
                list.append(target)
            }
        }
                
        return list;
    }
}
