function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    let vowels = ['a','e','i','o','u'];
    let arrVowels = [];
    let arrNonVowels = [];
    
    for(let char of s){
        if(vowels.includes(char)){
            arrVowels.push(char);
        } else {
            arrNonVowels.push(char);
        }
    }
    
    arrVowels.forEach((vowels) => console.log(vowels));
    arrNonVowels.forEach((nonVowels) => console.log(nonVowels));
}

function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}