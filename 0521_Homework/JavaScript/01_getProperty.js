const person = {
    name: 'Steve',
    age: 16,
      city: "Seoul",
      email: "steve@gmail.com"
  };

  let getProperty = function(obj,property) {
    return obj[property];
  }

  let output = getProperty(person, 'name');
  console.log(output); // --> 'Steve'
  
  output = getProperty(person, 'age');
  console.log(output); // --> 16
  
  output = getProperty(person, 'city'); // -> "Seoul"
  output = getProperty(person, 'lastName'); // undefined

