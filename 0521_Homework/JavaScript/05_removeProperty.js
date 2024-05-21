const obj = {
    name: 'Sam',
    age: 20,
  };

function removeProperty(obj, property) {
    delete obj[property];
}
  
  removeProperty(obj, 'name');
  console.log(obj.name); // --> undefined