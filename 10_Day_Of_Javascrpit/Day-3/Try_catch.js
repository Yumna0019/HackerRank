function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */

function reverseString(s) {
    try {
        let reversed =s.split("").reverse().join("");
        console.log(reversed);
    }catch(error) {
        console.log("s.split is not a function ");
        console.log(s);
    }   
}

function main() {
    const s = eval(readLine());
    
    reverseString(s);
}