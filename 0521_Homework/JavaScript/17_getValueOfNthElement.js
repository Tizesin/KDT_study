function getValueOfNthElement(arr, num) {
  if(arr.length === 0) return 'no name';
  if(arr.length -1 < num)
    num = arr.length -1;
  return arr[num];
}

let output = getValueOfNthElement([{ name: 'Kelly' }, { name: 'Anna' }], 1);
console.log(output); // --> 'Anna'

output = getValueOfNthElement([{ name: 'Kelly' }, { name: 'Anna' }], 2);
console.log(output); // --> 'Anna'

output = getValueOfNthElement(
  [{ name: 'Jim' }, { name: 'Tim' }, { name: 'Pooh' }],
  1
);
console.log(output); // --> 'Tim'

output = getValueOfNthElement([], 0);
console.log(output); // --> 'no name'