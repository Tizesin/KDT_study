const obj = { name: 'Steve', age: 13, gender: 'Male' };

function printObject(obj) {
    // TODO: 여기에 코드를 작성합니다.
      let result = "";
      for(let key in obj) {
          result = result + key + ": " + obj[key] + "\n";
      }
      return result;
  }
  

let output = printObject(obj);
console.log(output); // -->
/*
name: Steve
age: 13
gender: Male
*/