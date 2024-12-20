function readLine() {
    return inputString[currentLine++];
}

function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    const radius = readLine();
    // Print the area of the circle:
    let area = Math.PI * radius * radius; 
    console.log(area);
    // Print the perimeter of the circle:
    let perimeter = 2 * Math.PI * radius;
    console.log(perimeter);
    
    try {    
        // Attempt to redefine the value of constant variable PI
        PI = 0;
        // Attempt to print the value of PI
        console.log(PI);
    } catch(error) {
        console.error("You correctly declared 'PI' as a constant.");
    }
}