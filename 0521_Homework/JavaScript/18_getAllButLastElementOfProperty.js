const obj = {
    key: [1, 2, 3],
  };

  function getAllButLastElementOfProperty(obj, key) {
    if(!Array.isArray(obj[key]) || obj.length === 0 ){
        obj[key] = [];
        return obj[key];
    }
    return obj[key].slice(0,-1);
  }
  
  let output = getAllButLastElementOfProperty(obj, 'key');
  console.log(output); // --> [1,2]