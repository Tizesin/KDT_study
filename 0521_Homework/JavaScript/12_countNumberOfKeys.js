const obj = {
    a: 1,
    b: 2,
    c: 3,
  };
  function countNumberOfKeys(obj) {
    let cnt = 0;
    for(let key in obj) {
        cnt++;
    }
    return cnt;
  }
  
  let output = countNumberOfKeys(obj);
  console.log(output); // --> 3