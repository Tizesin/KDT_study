const obj = {
    a: 2,
    b: 'remaining',
    c: 4,
  };

  function removeNumberValues(obj) {
    for(let num in obj){
        if(typeof obj[num] === 'number') {
            delete obj[num];
        }
    }
    return obj;
  }
  removeNumberValues(obj);
  console.log(obj); // --> { b: 'remaining' }