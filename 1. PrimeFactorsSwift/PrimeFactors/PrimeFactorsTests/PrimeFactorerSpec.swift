import Quick
import Nimble
import PrimeFactors


///Users/Thoughtworker/Library/Developer/Xcode/DerivedData/PrimeFactors-bdbzqiqqodlhkiayeflenechnbdk/Build/Intermediates/PrimeFactors.build/all-product-headers.yaml
//Had to be fixed and locked

//Also Xcode 6 B3 needed to compile

class PrimeFactorerSpec: QuickSpec {
    override func spec() {
        
        describe("generate") {
            var list = [Int]()
            
            it("should return an empty array for the prime factors of 1") {
                list = []
                expect(PrimeFactorer.generate(1)).to.equal(list)
            }
            
            it("should return an array of 2 for the prime factors of 2") {
                list = [2]
                expect(PrimeFactorer.generate(2)).to.equal(list)
            }
            
            it("should return an array of 3 for the prime factors of 3") {
                list = [3]
                expect(PrimeFactorer.generate(3)).to.equal(list)
            }
            
            it("should return an array of 2 and 2 for the prime factors of 4") {
                list = [2, 2]
                expect(PrimeFactorer.generate(4)).to.equal(list)
            }
            
            it("should return an array of 2 and 3 for the prime factors of 6") {
                list = [2, 3]
                expect(PrimeFactorer.generate(6)).to.equal(list)
            }
            
            it("should return an array of 2, 2 and 2 for the prime factors of 8") {
                list = [2, 2, 2]
                expect(PrimeFactorer.generate(8)).to.equal(list)
            }
            
            it("should return an array of 3 and 3 for the prime factors of 9") {
                list = [3, 3]
                expect(PrimeFactorer.generate(9)).to.equal(list)
            }
        }
    }
}