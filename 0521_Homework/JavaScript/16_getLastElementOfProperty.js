const obj = {
    key: [1, 2, 5],
  }
  function getLastElementOfProperty(obj, property) {
    if(obj[property] !== undefined) {
        let value = obj[property];
        if(Array.isArray(value)) {
            if(value.length !== 0) {
                return value[value.length - 1];
            }
        }
    }
    return undefined;
  }
  
  function getLastElementOfProperty1(obj, property) {
      let arr = obj[property];
      return arr[arr.length - 1];
  }
  
  let output = getLastElementOfProperty(obj, 'key');
  console.log(output); // --> 5