const person1 = {
  name: 'Joe',
  role: 'Team Member',
};

const person2 = {
  name: 'Steve',
  role: 'CEO',
};

addObjectProperty(person1, 'manager', person2);
console.log(person1.manager);
/*
{
  name: 'Steve',
  role: 'CEO'
}
*/

console.log(person1);
/*
{
  name: 'Joe',
  role: 'Team Member',
  manager: {
    name: 'Steve',
    role: 'CEO'
  }
}
*/