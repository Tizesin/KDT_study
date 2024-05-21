let obj = {
    age: 19,
  };

function isPersonOldEnoughToVote(person) {
    return person.age >= 18 ? true : false;
}

  let output = isPersonOldEnoughToVote(obj);
  console.log(output); // --> true