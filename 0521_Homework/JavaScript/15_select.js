const arr = ['a', 'c', 'e'];
const obj = { a: 1, b: 2, c: 3, d: 4 };

function select(arr, obj) {
    // TODO: 여기에 코드를 작성합니다.
    let result = {};
      
    for(let key in obj) {
        if(arr.includes(key)) {
            result[key] = obj[key];
        }
    }
    return result; 
}

let output = select(arr, obj);
console.log(output); // --> { a: 1, c: 3 }