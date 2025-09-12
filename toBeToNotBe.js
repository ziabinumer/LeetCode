/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: function(n) {
            if (n === val) {
                return true;
            }
            throw "Not Equal"
        },
        notToBe: function(n) {
            if (n === val) {
                throw "Equal"
            }
            return true;
        }
    }
    
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */