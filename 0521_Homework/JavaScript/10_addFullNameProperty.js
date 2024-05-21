const person = {
    firstName: 'Jade',
    lastName: 'Smith'
  };

  function addFullNameProperty(obj) {
    obj.fullName = obj.firstName + " " + obj.lastName;
    //obj['fullname'] = `${obj.firstName} ${obj.lastName}`;
  }
  
  addFullNameProperty(person);
  console.log(person.fullName); // --> 'Jade Smith'
  /*
  person = {
    firstName: 'Jade',
    lastName: 'Smith',
      fullName: 'Jade Smith'
  };
  */