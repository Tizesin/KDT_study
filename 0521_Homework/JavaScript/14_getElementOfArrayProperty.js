let obj = {
    key: ['Jamil', 'Albrey'],
  };

  function getElementOfArrayProperty(obj, key, index) {
  let arrProperty = obj[key];
	if(Array.isArray(arrProperty)) {
		return arrProperty[index];
	} else {
		return undefined;
	}
}
  
  let output = getElementOfArrayProperty(obj, 'key', 0);
  console.log(output); // --> 'Jamil'

