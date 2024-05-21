let steve = {};

let addProperty = function(obj,property) {
    opj[property] = true;
}

addProperty(steve, 'isMale');
// steve = {isMale: true};
console.log(steve.isMale); // --> true

addProperty(steve, 'isProgrammer');
console.log(steve.isProgrammer); // --> true

let jessica = {};
addProperty(jessica, 'isSmart');
console.log(jessica.isSmart); // --> true